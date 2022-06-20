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

    @RequestMapping("/regions")
    public String displayAllRegions(Model model){
    model.addAttribute("regions", regionRepository.findAll());
    return "regionsTemplate";
    }

    @RequestMapping("/region/{id}")
    public String displaySingleRegionById(@PathVariable long id, Model model){
    model.addAttribute("region", regionRepository.findById(id));
    return "regionTemplate";
    }
//
//    @RequestMapping("/region/{regionName}")
//    public String displaySingleRegionByName(@PathVariable String regionName, Model model){
//    model.addAttribute("Region", regionRepository.findByRegionName(regionName));
//    return "regionTemplate";
//    }
}
