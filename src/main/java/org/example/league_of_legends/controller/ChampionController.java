package org.example.league_of_legends.controller;

import org.example.league_of_legends.dto.CreateChampionDto;
import org.example.league_of_legends.dto.CreateSkinDto;
import org.example.league_of_legends.dto.PartialUpdateChampionDto;
import org.example.league_of_legends.dto.PartialUpdateSkinDto;
import org.example.league_of_legends.model.Champion;
import org.example.league_of_legends.model.Skin;
import org.example.league_of_legends.repository.ChampionRepository;
import org.example.league_of_legends.repository.SkinRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class ChampionController {

    private final ChampionRepository repository;
    SkinRepository skinRepository = new SkinRepository();

    ChampionController() {
        this.repository = new ChampionRepository();
    }

    @GetMapping("/champion")
    public ArrayList<Champion> findChampions() {
        return repository.findAll();
    }

    @GetMapping("/champion/{id}")
    public Champion findChampionById(@PathVariable int id) {
        return repository.findById(id);
    }

    @DeleteMapping("/champion/{id}")
    public void deleteChampion(@PathVariable int id) {
        repository.deleteById(id);
    }

    @PostMapping("/champion/{id}/skin")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createSkin(@RequestBody Skin skin, @PathVariable int id) {
        Champion champion = repository.findById(id);
        champion.addSkin(skin);
        return champion;
    }

    @PostMapping("/champion")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createChampion(@RequestBody CreateChampionDto championDto) {
        Champion champion = new Champion(championDto);
        return repository.save(champion);
    }

    @PutMapping("/champion/{id}")
    public Champion UpdateChampion(@RequestBody CreateChampionDto updateChampionDto, @PathVariable int id) {
        Champion champion = repository.findById(id);
        return champion.updateFromDto(updateChampionDto);
    }

    @PutMapping("/champion/{id}/skin")
    public Skin UpdateSkin(@RequestBody CreateSkinDto updateSkinDto, @PathVariable int id) {
        Skin skin = skinRepository.findById(id);
        return skin.updateFromDto(updateSkinDto);
    }

    @PatchMapping
    public Champion PartialUpdateChampion(@RequestBody PartialUpdateChampionDto dto,@PathVariable int id) {
        Champion champion = repository.findById(id);
        return champion.partialUpdateFromDto(dto);
    }

    @PatchMapping
    public Skin PartialUpdateSkin(@RequestBody PartialUpdateSkinDto dto, @PathVariable int id) {
       Skin skin = skinRepository.findById(id);
        return skin.partialUpdateFromDto(dto);
    }
}
