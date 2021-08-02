package org.example.league_of_legends.model;

import org.example.league_of_legends.dto.CreateChampionDto;
import org.example.league_of_legends.dto.CreateSkinDto;

public class Skin implements Cloneable {
    private static int counter = 1;
    private final int id;
    private String name;
    private String releaseDate;
    private int riotPointPrice;
    private boolean obtainable;

    public Skin(String name, String releaseDate, int riotPointPrice, boolean obtainable) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.riotPointPrice = riotPointPrice;
        this.obtainable = obtainable;
        this.id = counter;
        counter++;
    }

    @Override
    public Object clone() {
        try {
            return (Skin) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return new Skin(this.name,this.releaseDate,this.riotPointPrice,this.obtainable);
        }
    }

    public Skin updateFromDto(CreateSkinDto dto) {
       this.name = dto.getName();
       this.obtainable = dto.isObtainable();
       this.releaseDate = dto.getReleaseDateOf();
       this.riotPointPrice = dto.getRiotPointPrice();
       return this;
    }

    public String getName() {
        return name;
    }

    public void setRiotPointPrice(int riotPointPrice) {
        this.riotPointPrice = riotPointPrice;
    }

    public void setObtainable(boolean obtainable) {
        this.obtainable = obtainable;
    }

    public int getRiotPointPrice() {
        return riotPointPrice;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public boolean getObtainable() {
        return obtainable;
    }

    public int getId() {
        return id;
    }
}
