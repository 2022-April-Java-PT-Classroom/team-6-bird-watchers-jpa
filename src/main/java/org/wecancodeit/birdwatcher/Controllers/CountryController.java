package org.wecancodeit.birdwatcher.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.birdwatcher.Repositories.CountryRepository;

import javax.annotation.Resource;

@Controller
@RequestMapping("/country")
public class CountryController {
    @Resource
    private CountryRepository countryRepository;

    @RequestMapping("/{id}")
    public String displaySingleCountry(Model model, @PathVariable Long id){
    model.addAttribute("Country", countryRepository.findById(id));
    return "countryTemplate";
    }
}