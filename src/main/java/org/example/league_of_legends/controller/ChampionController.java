package org.example.league_of_legends.controller;

import org.example.league_of_legends.dto.CreateChampionDto;
import org.example.league_of_legends.model.Champion;
import org.example.league_of_legends.model.Skin;
import org.example.league_of_legends.repository.ChampionRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ChampionController {

    private ChampionRepository repository;

    ChampionController() {
        this.repository = new ChampionRepository();
    }

    @GetMapping("/champion")
    public ArrayList<Champion> findChampions() {
        return repository.findAll();
    }

    @PostMapping("/champion")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createChampion(@RequestBody CreateChampionDto championDto) {
        Champion champion = new Champion(championDto);
        Champion createdChampion = repository.save(champion);
        return createdChampion;
    }

    @GetMapping("/champion/{id}")
    public Champion findChampionById(@PathVariable int id) {
        return repository.findById(id);
    }

    // DELETE /champion/{id}
    // PATCH /champion/{id}

    @PostMapping("/champion/{id}/skin")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createSkin(@RequestBody Skin skin, @PathVariable int id) {
        Champion champion = repository.findById(id);
        champion.addSkin(skin);
        return champion;
    }

    // PATCH /champion/{id}/skin
}
