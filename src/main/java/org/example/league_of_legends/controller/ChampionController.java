package org.example.league_of_legends.controller;

import org.example.league_of_legends.dto.CreateChampionDto;
import org.example.league_of_legends.dto.CreateSkinDto;
import org.example.league_of_legends.dto.PartialUpdateChampionDto;
import org.example.league_of_legends.dto.PartialUpdateSkinDto;
import org.example.league_of_legends.model.Champion;
import org.example.league_of_legends.model.Skin;
import org.example.league_of_legends.repository.ChampionRepository;
import org.example.league_of_legends.repository.DataBaseRepository;
import org.example.league_of_legends.repository.SkinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@Controller // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class ChampionController {

    @Autowired
    private DataBaseRepository dataBaseRepository;

    private ChampionRepository championRepository;

    private SkinRepository skinRepository;

    @GetMapping(path = "/champion")
    public @ResponseBody Iterable<Champion> findChampions() {
        return dataBaseRepository.findAll();
    }

    @GetMapping("/champion/{id}")
    public Champion findChampionById(@PathVariable int id) {
        return championRepository.findById(id);
    }

    @DeleteMapping("/champion/{id}")
    public void deleteChampion(@PathVariable int id) {
        dataBaseRepository.deleteById(id);
    }

    @PostMapping("/champion/{id}/skin")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createSkin(@RequestBody Skin skin, @PathVariable int id) {
        Champion champion = championRepository.findById(id);
        champion.addSkin(skin);
        return champion;
    }

    @PostMapping(path = "/champion")
    @ResponseStatus(HttpStatus.CREATED)
    public Champion createChampion(@RequestBody CreateChampionDto championDto) {
        Champion champion = new Champion(championDto);
        return dataBaseRepository.save(champion);
    }

    @PutMapping("/champion/{id}")
    public Champion UpdateChampion(@RequestBody CreateChampionDto updateChampionDto, @PathVariable int id) {
        Champion champion = championRepository.findById(id);
        return champion.updateFromDto(updateChampionDto);
    }

    @PutMapping("/champion/{id}/skin")
    public Skin UpdateSkin(@RequestBody CreateSkinDto updateSkinDto, @PathVariable int id) {
        Skin skin = skinRepository.findById(id);
        return skin.updateFromDto(updateSkinDto);
    }

    @PatchMapping("/champion/{id}")
    public Champion PartialUpdateChampion(@RequestBody PartialUpdateChampionDto dto,@PathVariable int id) {
        Champion champion = championRepository.findById(id);
        return champion.partialUpdateFromDto(dto);
    }

    @PatchMapping("/champion/{id}/skin")
    public Skin PartialUpdateSkin(@RequestBody PartialUpdateSkinDto dto, @PathVariable int id) {
       Skin skin = skinRepository.findById(id);
        return skin.partialUpdateFromDto(dto);
    }
}