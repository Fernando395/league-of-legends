package org.example.league_of_legends.exceptions;

public class SkinNotFoundException extends RuntimeException {

    public SkinNotFoundException(int id) {
        super("Skin not found " + id);
    }
}
