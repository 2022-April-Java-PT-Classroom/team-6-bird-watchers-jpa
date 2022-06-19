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
    model.addAttribute("Tours", tourRepository.findAll());
    return "toursTemplate";
    }

    @RequestMapping("/tours/{name}")
    public String displaySingleTourByName(@PathVariable String name, Model model){
    model.addAttribute("Tour", tourRepository.findByName(name));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{description}")
    public String displaySingleTourByDescription(@PathVariable String description, Model model){
    model.addAttribute("Tour", tourRepository.findByDescription(description));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{country}")
    public String displaySingleTourByCountry(@PathVariable String country, Model model){
    model.addAttribute("Tour", tourRepository.findByCountry(country));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{region}")
    public String displaySingleTourByRegion(@PathVariable String region, Model model){
    model.addAttribute("Tour", tourRepository.findByRegion(region));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{habitat}")
    public String displaySingleTourByHabitat(@PathVariable String habitat, Model model){
    model.addAttribute("Tour", tourRepository.findByHabitat(habitat));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{birds}")
    public String displaySingleTourByBirds(@PathVariable String birds, Model model){
    model.addAttribute("Tour", tourRepository.findByBirds(birds));
    return "tourTemplate";
    }
}
