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

    @RequestMapping("/country")
    public String displayAllCountries(Model model){
    model.addAttribute("Country", countryRepository.findAll());
    return "countryTemplate";
    }

    @RequestMapping("/country/{name}")
    public String displaySingleCountry(@PathVariable String name, Model model){
    model.addAttribute("Country", countryRepository.findByCountry(name));
    return "countryTemplate";
    }

}