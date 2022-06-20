package org.wecancodeit.birdwatcher.Controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.BirdRepository;

import javax.annotation.Resource;


@Controller
public class BirdController {
    @Resource
    private BirdRepository birdRepository;

    @RequestMapping("/bird")
    public String displayAllBirds(Model model){
    model.addAttribute("Bird", birdRepository.findAll());
    return "birdTemplate";
    }

    @RequestMapping("/bird/{id}")
    public String displaySingleBirdById(@PathVariable Long id, Model model){
    model.addAttribute("Bird", birdRepository.findById(id));
    return "birdTemplate";
    }

    @RequestMapping("/bird/{birdName}")
    public String displaySingleBirdByName(@PathVariable String birdName, Model model){
    model.addAttribute("Bird", birdRepository.findByBirdName(birdName));
    return "birdTemplate";
    }

    @RequestMapping("/bird/{birdType}")
    public String displayBirdsByBirdType(@PathVariable String birdType, Model model){
    model.addAttribute("Bird", birdRepository.findByBirdType(birdType));
    return "birdTemplate";
    }

    @RequestMapping("/bird/{birdOrder}")
    public String displayBirdsByBirdOrder(@PathVariable String birdOrder, Model model){
    model.addAttribute("Bird", birdRepository.findByBirdOrder(birdOrder));
    return "birdTemplate";
    }
}
