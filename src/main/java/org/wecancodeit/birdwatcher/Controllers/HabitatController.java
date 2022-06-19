package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.HabitatRepository;

import javax.annotation.Resource;


@Controller
public class HabitatController {

    @Resource
    private HabitatRepository habitatRepo;

    @RequestMapping("/habitats")
    public String displayAllHabitats(Model model){
        model.addAttribute("Habitat", habitatRepo.findAll());
        return "habitatsTemplate";
    }

    @RequestMapping("/habitat/{habitatName}")
    public String displaySingleHabitat(@PathVariable String name, Model model){
        model.addAttribute("Habitat", habitatRepo.findByHabitatName(name));
        return "habitatTemplate";
    }
}
