package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.RegionRepository;

import javax.annotation.Resource;

@Controller
public class RegionController {
    @Resource
    private RegionRepository regionRepository;

    @RequestMapping("/region")
    public String displayAllRegions(Model model){
    model.addAttribute("Region", regionRepository.findAll());
    return "regionTemplate";
    }

    @RequestMapping("/region/{name}")
    public String displaySingleRegion(@PathVariable String name, Model model){
    model.addAttribute("Region", regionRepository.findByName(name));
    return "regionTemplate";
    }
}
