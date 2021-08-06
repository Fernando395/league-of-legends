package org.example.league_of_legends.exceptions;

public class ChampionNotFoundException extends RuntimeException {

    public ChampionNotFoundException(int id) {
        super("Champion not found " + id);
    }
}