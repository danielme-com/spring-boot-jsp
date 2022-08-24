package com.danielme.blog.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CountriesController {

    @RequestMapping("/")
    public String list(Model model) {
        model.addAttribute("countriesList", buildCountriesList());
        return "countriesList";
    }

    private List<Country> buildCountriesList() {
        List<Country> countries = new ArrayList<>();

        countries.add(new Country("Mexico", 130497248));
        countries.add(new Country("Spain", 49067981));
        countries.add(new Country("Colombia", 46070146));

        return countries;
    }

}
