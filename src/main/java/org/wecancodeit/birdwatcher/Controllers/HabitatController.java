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
    public String displayAllHabitats(Model model) {
        model.addAttribute("habitats", habitatRepo.findAll());
        return "habitatsTemplate";
    }

    @RequestMapping("/habitat/{id}")
    public String displaySingleHabitatById(@PathVariable long id, Model model) {
        model.addAttribute("habitat", habitatRepo.findById(id));
        return "habitatTemplate";
    }

//    @RequestMapping("/habitat/{habitatName}")
//    public String displaySingleHabitatByName(@PathVariable String habitatName, Model model){
//        model.addAttribute("Habitat", habitatRepo.findByHabitatName(habitatName));
//        return "habitatTemplate";
//    }
}
