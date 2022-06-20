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
    public String displaySingleTourByName(@PathVariable String tourName, Model model){
    model.addAttribute("Tour", tourRepository.findByTourName(tourName));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourDescription}")
    public String displaySingleTourByDescription(@PathVariable String tourDescription, Model model){
    model.addAttribute("Tour", tourRepository.findByTourDescription(tourDescription));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourCountry}")
    public String displaySingleTourByCountry(@PathVariable String tourCountry, Model model){
    model.addAttribute("Tour", tourRepository.findByTourCountry(tourCountry));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourRegion}")
    public String displaySingleTourByRegion(@PathVariable String tourRegion, Model model){
    model.addAttribute("Tour", tourRepository.findByTourRegion(tourRegion));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourHabitat}")
    public String displaySingleTourByHabitat(@PathVariable String tourHabitat, Model model){
    model.addAttribute("Tour", tourRepository.findByTourHabitat(tourHabitat));
    return "tourTemplate";
    }

    @RequestMapping("/tours/{tourBirds}")
    public String displaySingleTourByBirds(@PathVariable String tourBirds, Model model){
    model.addAttribute("Tour", tourRepository.findByTourBirds(tourBirds));
    return "tourTemplate";
    }
}
