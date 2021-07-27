package org.example.league_of_legends.model;

public class Skin {
    private static int counter = 1;
    private final int id;
    private String name;
    private String releaseDateOf;
    private int riotPointPrice;
    private boolean obtainable;

    public Skin(String name, String releaseDateOf, int riotPointPrice, boolean obtainable) {
        this.name = name;
        this.releaseDateOf = releaseDateOf;
        this.riotPointPrice = riotPointPrice;
        this.obtainable = obtainable;
        this.id = counter;
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getRiotPointPrice() {
        return riotPointPrice;
    }

    public String getReleaseDateOf() {
        return releaseDateOf;
    }

    public boolean getObtainable() {
        return obtainable;
    }

    public int getId() {
        return id;
    }
}
