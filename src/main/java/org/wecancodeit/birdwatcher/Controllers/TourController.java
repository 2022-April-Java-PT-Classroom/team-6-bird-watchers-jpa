package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.wecancodeit.birdwatcher.Repositories.TourRepository;

import javax.annotation.Resource;

@Controller
public class TourController {
    @Resource
    private TourRepository tourRepository;

    @RequestMapping("/tours")
    public String displayAllTours(Model model) {
        model.addAttribute("tours", tourRepository.findAll());
        return "toursTemplate";
    }

    @RequestMapping("/tour/{id}")
    public String displaySingleTourById(@PathVariable long id, Model model) {
        model.addAttribute("tour", tourRepository.findById(id));
        return "tourTemplate";
    }
//
//    @RequestMapping("/tour/{tourName}")
//    public String displaySingleTourByName(@PathVariable String tourName, Model model){
//    model.addAttribute("tourName", tourRepository.findByTourName(tourName));
//    return "tourTemplate";
//    }
//
//    @RequestMapping("/tour/{tourDescription}")
//    public String displaySingleTourByDescription(@PathVariable String tourDescription, Model model){
//    model.addAttribute("tourDescription", tourRepository.findByTourDescription(tourDescription));
//    return "tourTemplate";
//    }
//
//    @RequestMapping("/tour/{tourCountry}")
//    public String displaySingleTourByCountry(@PathVariable String tourCountry, Model model){
//    model.addAttribute("Tour", tourRepository.findByTourCountry(tourCountry));
//    return "tourTemplate";
//    }
//
//    @RequestMapping("/tour/{tourRegion}")
//    public String displaySingleTourByRegion(@PathVariable String tourRegion, Model model){
//    model.addAttribute("Tour", tourRepository.findByTourRegion(tourRegion));
//    return "tourTemplate";
//    }
//
//    @RequestMapping("/tour/{tourHabitat}")
//    public String displaySingleTourByHabitat(@PathVariable String tourHabitat, Model model){
//    model.addAttribute("Tour", tourRepository.findByTourHabitat(tourHabitat));
//    return "tourTemplate";
//    }
//
//    @RequestMapping("/tour/{tourBirds}")
//    public String displaySingleTourByBirds(@PathVariable String tourBirds, Model model){
//    model.addAttribute("Tour", tourRepository.findByTourBirds(tourBirds));
//    return "tourTemplate";
//    }
}
