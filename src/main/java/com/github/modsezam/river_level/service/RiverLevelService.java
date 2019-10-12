package com.github.modsezam.river_level.service;

import com.github.modsezam.river_level.model.RiverLevel;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RiverLevelService {

    private LinkedHashSet<String> listOfRivers = new LinkedHashSet<>();
    private RiverLevel[] riverLevels;

    public void getData(){
        RestTemplate restTemplate = new RestTemplate();
        riverLevels = restTemplate.getForObject("https://danepubliczne.imgw.pl/api/data/hydro", RiverLevel[].class);
        if (riverLevels != null) {
            Arrays.stream(riverLevels).forEach(riverLevel -> listOfRivers.add(riverLevel.getRzeka()));
        }
    }

    public List<RiverLevel> getRiverDetails(int id){
        if (riverLevels == null) {
            getData();
        }
        List<String> arrayListOfRivers = new ArrayList<>(listOfRivers);
        String riverName = arrayListOfRivers.get(id - 1);
        if (riverLevels != null) {
            return Arrays.stream(riverLevels).filter(riverLevel -> riverLevel.getRzeka().equals(riverName)).collect(Collectors.toList());
        }
        return null;
    }

    public LinkedHashSet<String> getListOfRivers() {
        return listOfRivers;
    }
}
