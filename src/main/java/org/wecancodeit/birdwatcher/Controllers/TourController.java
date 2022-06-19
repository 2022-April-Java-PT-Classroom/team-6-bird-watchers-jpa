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

    @RequestMapping("/tours/{tourName}")
    public String displaySingleTourByName(@PathVariable String name, Model model){
    model.addAttribute("Tour", tourRepository.findByTourName(name));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourDescription}")
    public String displaySingleTourByDescription(@PathVariable String description, Model model){
    model.addAttribute("Tour", tourRepository.findByTourDescription(description));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourCountry}")
    public String displaySingleTourByCountry(@PathVariable String country, Model model){
    model.addAttribute("Tour", tourRepository.findByTourCountry(country));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourRegion}")
    public String displaySingleTourByRegion(@PathVariable String region, Model model){
    model.addAttribute("Tour", tourRepository.findByTourRegion(region));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourHabitat}")
    public String displaySingleTourByHabitat(@PathVariable String habitat, Model model){
    model.addAttribute("Tour", tourRepository.findByTourHabitat(habitat));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourBirds}")
    public String displaySingleTourByBirds(@PathVariable String birds, Model model){
    model.addAttribute("Tour", tourRepository.findByTourBirds(birds));
    return "tourTemplate";
    }
}
