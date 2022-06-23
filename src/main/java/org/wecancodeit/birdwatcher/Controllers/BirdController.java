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

    @RequestMapping("/birds")
    public String displayAllBirds(Model model){
    model.addAttribute("birds", birdRepository.findAll());
    return "birdsTemplate";
    }

    @RequestMapping("/bird/{id}")
    public String displaySingleBirdById(@PathVariable long id, Model model){
    model.addAttribute("bird", birdRepository.findById(id));
    return "birdTemplate";
    }

}
