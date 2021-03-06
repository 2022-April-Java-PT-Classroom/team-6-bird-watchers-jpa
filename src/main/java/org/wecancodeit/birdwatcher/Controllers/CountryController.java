package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.CountryRepository;

import javax.annotation.Resource;

@Controller
public class CountryController {
    @Resource
    private CountryRepository countryRepository;

    @RequestMapping("/countries")
    public String displayAllCountries(Model model) {
        model.addAttribute("countries", countryRepository.findAll());
        return "countriesTemplate";
    }

    @RequestMapping("/country/{id}")
    public String displaySingleCountryById(@PathVariable long id, Model model) {
        model.addAttribute("country", countryRepository.findById(id));
        return "countryTemplate";
    }

}