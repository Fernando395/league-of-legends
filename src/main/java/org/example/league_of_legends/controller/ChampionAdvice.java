package org.example.league_of_legends.controller;

import org.example.league_of_legends.exceptions.ChampionNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ChampionAdvice {
    @ResponseBody
    @ExceptionHandler(ChampionNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleChampionNotFound(ChampionNotFoundException e) {
        return e.getMessage();
    }
}