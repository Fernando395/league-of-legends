package org.example.league_of_legends.model;

import org.example.league_of_legends.dto.CreateChampionDto;

import java.util.ArrayList;

public class Champion {
    private static int counter = 1;
    private final int id;
    private String name;
    private String position;
    private States states;
    private ArrayList<Skill> skills;
    private Features features;
    private Skin skinDefault;
    private ArrayList<Skin> skins;
    private String releaseDateOf;
    private int influencePointPrice;
    private int riotPointPrice;

    public Champion(String name, String position, ArrayList<Skill> skills, States states, Features features, Skin skinDefault, String releaseDateOf, int influencePointPrice, int riotPointPrice) {
        this.name = name;
        this.position = position;
        this.skills = skills;
        this.states = states;
        this.features = features;
        this.skinDefault = skinDefault;
        this.releaseDateOf = releaseDateOf;
        this.influencePointPrice = influencePointPrice;
        this.riotPointPrice = riotPointPrice;
        this.id = counter;
        counter++;
        this.skins = new ArrayList<>();
    }

    public Champion(CreateChampionDto dto) {
        this(dto.getName(), dto.getPosition(), dto.getSkills(), dto.getStates(), dto.getFeatures(), dto.getSkinDefault(), dto.getReleaseDateOf(), dto.getInfluencePointPrice(), dto.getRiotPointPrice());
    }

    public String getName() {
        return name;
    }

    public States getStates() {
        return states;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }

    public Features getFeatures() {
        return features;
    }

    public String getPosition() {
        return position;
    }

    public String getReleaseDateOf() {
        return releaseDateOf;
    }

    public int getInfluencePointPrice() {
        return influencePointPrice;
    }

    public Skin getSkinDefault() {
        return skinDefault;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Skin> getSkins() {
        return skins;
    }

    public int getRiotPointPrice() {
        return riotPointPrice;
    }

    public void addSkin(Skin skin) {
        this.skins.add(skin);
    }

    public void removeSkin(Skin skin) {
        this.skins.remove(skin);
    }

    public void updateSkin(Skin skin, int id) {
        for (int i = 0; i < skins.size(); i++) {
            if (id == skins.get(i).getId()) {
                skins.remove(skin.getId());
                skins.add(skin);
            }
        }
    }
}
