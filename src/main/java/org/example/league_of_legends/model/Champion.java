package org.example.league_of_legends.model;

import org.example.league_of_legends.dto.CreateChampionDto;

import java.util.ArrayList;

public class Champion {
    private String image;
    private static int counter = 1;
    private final int id;
    private String name;
    private String position;
    private States states;
    private ArrayList<Skill> skills;
    private Features features;
    private Skin skinDefault;
    private ArrayList<Skin> skins;
    private String releaseDate;
    private int influencePointPrice;
    private int riotPointPrice;

    public Champion(String image, String name, String position, ArrayList<Skill> skills, States states, Features features, Skin skinDefault, String releaseDate, int influencePointPrice, int riotPointPrice) {
        this.image = image;
        this.name = name;
        this.position = position;
        this.skills = skills;
        this.states = states;
        this.features = features;
        this.skinDefault = skinDefault;
        this.releaseDate = releaseDate;
        this.influencePointPrice = influencePointPrice;
        this.riotPointPrice = riotPointPrice;
        this.id = counter;
        counter++;
        this.skins = new ArrayList<>();
    }

    public Champion(CreateChampionDto dto) {
        this(dto.getImage(), dto.getName(), dto.getPosition(), dto.getSkills(), dto.getStates(), dto.getFeatures(), dto.getSkinDefault(), dto.getReleaseDate(), dto.getInfluencePointPrice(), dto.getRiotPointPrice());
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

    public String getReleaseDate() {
        return releaseDate;
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

    public String getImage() {
        return image;
    }

    public void addSkin(Skin skin) {
        this.skins.add(skin);
    }

    public void removeSkin(Skin skin) {
        this.skins.remove(skin);
    }

    public void updateSkin(Skin newSkin) {
        for (Skin skin : skins) {
            if (skin.getId() == newSkin.getId()) {
                skins.remove(skin);
                skins.add(newSkin);
                break;
            }
        }
    }

    public Champion updateFromDto(CreateChampionDto dto) {
        this.name = dto.getName();
        this.position = dto.getPosition();
        this.skinDefault = dto.getSkinDefault();
        this.riotPointPrice = dto.getRiotPointPrice();
        this.states = dto.getStates();
        this.influencePointPrice = dto.getInfluencePointPrice();
        this.skills = dto.getSkills();
        this.features = dto.getFeatures();
        this.releaseDate = dto.getReleaseDate();
        return this;
    }

    // public Champion partialUpdateFromDto(CreateChampionDto dto) {
    //   if (dto.getName().isPresent()) {
    //      this.name = dto.getName().get();
    // }
    // if (dto.getPosition().isPresent()) {
    //     this.position = dto.getPosition().get();
    // }
    // if (dto.getFeatures().isPresent()) {
    //    this.features = dto.getFeatures().get();
    // }
    // if (dto.getSkills().isPresent()) {
    //     this.skills = dto.getSkills().get();
    //}
    //if (dto.getStates().isPresent()) {
    //    this.states = dto.getStates().get();
    //}
    //if (dto.getInfluencePointPrice().isPresent()) {
    //   this.influencePointPrice = dto.getInfluencePointPrice().get();
    // }
    // if (dto.getReleaseDateOf().isPresent()) {
    //    this.releaseDate = dto.getReleaseDateOf().get();
    // }
    // if (dto.getRiotPointPrice().isPresent()) {
    //     this.riotPointPrice = dto.getRiotPointPrice().get();
    // }
    // if (dto.getSkinDefault().isPresent()) {
    //     this.skinDefault = dto.getSkinDefault().get();
    // }
    //return this;
    // }
}
