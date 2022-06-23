package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.TourRepository;

import javax.annotation.Resource;

@Controller
public class TourController {
    @Resource
    private TourRepository tourRepository;

    @RequestMapping("/tours")
    public String displayAllTours(Model model){
    model.addAttribute("tours", tourRepository.findAll());
    return "toursTemplate";
    }

    @RequestMapping("/tour/{id}")
    public String displaySingleTourById(@PathVariable long id, Model model){
    model.addAttribute("tour", tourRepository.findById(id));
    return "tourTemplate";
    }
}
