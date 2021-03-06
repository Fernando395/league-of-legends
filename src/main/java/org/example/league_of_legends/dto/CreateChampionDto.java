package org.example.league_of_legends.dto;

import org.example.league_of_legends.model.Features;
import org.example.league_of_legends.model.Skill;
import org.example.league_of_legends.model.Skin;
import org.example.league_of_legends.model.States;

import java.util.ArrayList;

public class CreateChampionDto {
    public String image;
    private String name;
    private String position;
    private States states;
    private ArrayList<Skill> skills;
    private Features features;
    private Skin skinDefault;
    private String releaseDate;
    private int influencePointPrice;
    private int riotPointPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public States getStates() {
        return states;
    }

    public void setStates(States states) {
        this.states = states;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skill> skills) {
        this.skills = skills;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public Skin getSkinDefault() {
        return skinDefault;
    }

    public void setSkinDefault(Skin skinDefault) {
        this.skinDefault = skinDefault;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getInfluencePointPrice() {
        return influencePointPrice;
    }

    public void setInfluencePointPrice(int influencePointPrice) {
        this.influencePointPrice = influencePointPrice;
    }

    public int getRiotPointPrice() {
        return riotPointPrice;
    }

    public void setRiotPointPrice(int riotPointPrice) {
        this.riotPointPrice = riotPointPrice;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}