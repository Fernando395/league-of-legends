package org.example.league_of_legends.dto;

public class CreateSkinDto {
    private String image;
    private String name;
    private String releaseDateOf;
    private int riotPointPrice;
    private boolean obtainable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDateOf() {
        return releaseDateOf;
    }

    public void setReleaseDateOf(String releaseDateOf) {
        this.releaseDateOf = releaseDateOf;
    }

    public int getRiotPointPrice() {
        return riotPointPrice;
    }

    public void setRiotPointPrice(int riotPointPrice) {
        this.riotPointPrice = riotPointPrice;
    }

    public boolean isObtainable() {
        return obtainable;
    }

    public void setObtainable(boolean obtainable) {
        this.obtainable = obtainable;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}