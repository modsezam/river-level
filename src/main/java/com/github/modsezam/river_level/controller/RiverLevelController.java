package com.github.modsezam.river_level.controller;

import com.github.modsezam.river_level.model.RiverLevel;
import com.github.modsezam.river_level.service.RiverLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
public class RiverLevelController {

    @Autowired
    private RiverLevelService riverLevelService;

    @GetMapping("/")
    public String indexPage(Model model) {
        riverLevelService.getData();
        model.addAttribute("listOdRivers", riverLevelService.getListOfRivers());
        return "index";
    }

    @GetMapping("/rivers/{id}")
    public String getRiverDetails(Model model, @PathVariable Integer id) {
        model.addAttribute("riverDetails", riverLevelService.getRiverDetails(id));
        return "river";
    }

}
