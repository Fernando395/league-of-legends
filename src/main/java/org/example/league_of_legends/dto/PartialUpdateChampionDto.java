package org.example.league_of_legends.dto;

import org.example.league_of_legends.model.Features;
import org.example.league_of_legends.model.Skill;
import org.example.league_of_legends.model.Skin;
import org.example.league_of_legends.model.States;
import org.openapitools.jackson.nullable.JsonNullable;

import java.util.ArrayList;

public class PartialUpdateChampionDto {

    private final JsonNullable<String> name = JsonNullable.undefined();
    private final JsonNullable<String> position = JsonNullable.undefined();
    private final JsonNullable<States> states = JsonNullable.undefined();
    private final JsonNullable<ArrayList<Skill>> skills = JsonNullable.undefined();
    private final JsonNullable<Features> features = JsonNullable.undefined();
    private final JsonNullable<Skin> skinDefault = JsonNullable.undefined();
    private final JsonNullable<String> releaseDate = JsonNullable.undefined();
    private final JsonNullable<Integer> riotPointPrice = JsonNullable.undefined();
    private final JsonNullable<Integer> influencePointPrice = JsonNullable.undefined();

    public JsonNullable<String> getName() {
        return name;
    }

    public JsonNullable<String> getPosition() {
        return position;
    }

    public JsonNullable<States> getStates() {
        return states;
    }

    public JsonNullable<ArrayList<Skill>> getSkills() {
        return skills;
    }

    public JsonNullable<Features> getFeatures() {
        return features;
    }

    public JsonNullable<Skin> getSkinDefault() {
        return skinDefault;
    }

    public JsonNullable<String> getReleaseDate() {
        return releaseDate;
    }

    public JsonNullable<Integer> getRiotPointPrice() {
        return riotPointPrice;
    }

    public JsonNullable<Integer> getInfluencePointPrice() {
        return influencePointPrice;
    }
}