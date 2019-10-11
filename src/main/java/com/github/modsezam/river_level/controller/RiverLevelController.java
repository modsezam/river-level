package com.github.modsezam.river_level.controller;

import com.github.modsezam.river_level.model.AnimalFact;
import com.github.modsezam.river_level.model.RiverLevel;
import com.github.modsezam.river_level.service.RiverLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@Controller
public class RiverLevelController {

    @Autowired
    private RiverLevelService riverLevelService;

    @GetMapping("/")
    public String indexPage(Model model){

        RestTemplate restTemplate = new RestTemplate();
        RiverLevel[] riverLevels = restTemplate.getForObject("http://danepubliczne.imgw.pl/api/data/hydro", RiverLevel[].class);
        AnimalFact[] animalFact = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?amount=6", AnimalFact[].class);

        System.out.println("test");
        if (riverLevels != null) {
            System.out.println(riverLevels.length);
        }
        if (animalFact != null) {
            System.out.println(animalFact.length);
        }

        return "index";
    }

}
