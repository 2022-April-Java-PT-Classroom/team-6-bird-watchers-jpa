package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.TourRepository;

import javax.annotation.Resource;

@Controller
public class MainController {
    @Resource
    private TourRepository tourRepository;

    @GetMapping("/")
    public String displayHomePage(Model model) {
        model.addAttribute("Tours", tourRepository.findAll());
        return "index";
    }

    @RequestMapping("/about")
    public String displayAboutPage(Model model) {
        model.addAttribute("Tours", tourRepository.findAll());
        return "about";
    }

    @RequestMapping("/faq")
    public String displayFaqPage(Model model) {
        model.addAttribute("Tours", tourRepository.findAll());
        return "faq";
    }

    @RequestMapping("/termsAndConditions")
    public String displayTermsAndConditionsPage(Model model) {
        model.addAttribute("Tours", tourRepository.findAll());
        return "terms-and-conditions";
    }

    @RequestMapping("/sike")
    public String displaySikePage(Model model) {
        model.addAttribute("Sike", tourRepository.findAll());
        return "sike";
    }
}

