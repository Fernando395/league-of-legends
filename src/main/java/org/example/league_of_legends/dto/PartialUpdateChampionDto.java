package org.example.league_of_legends.dto;

import org.openapitools.jackson.nullable.JsonNullable;

public class PartialUpdateChampionDto {

    private final JsonNullable<String> name = JsonNullable.undefined();
    private final JsonNullable<String> position = JsonNullable.undefined();
    private final JsonNullable<String> states = JsonNullable.undefined();
    private final JsonNullable<String> skills = JsonNullable.undefined();
    private final JsonNullable<String> features = JsonNullable.undefined();
    private final JsonNullable<String> skinDefault = JsonNullable.undefined();
    private final JsonNullable<String> releaseDate = JsonNullable.undefined();
    private final JsonNullable<Integer> riotPointPrice = JsonNullable.undefined();
    private final JsonNullable<Boolean> influencePointPrice = JsonNullable.undefined();

    public JsonNullable<String> getName() {
        return name;
    }

    public JsonNullable<String> getPosition() {
        return position;
    }

    public JsonNullable<String> getStates() {
        return states;
    }

    public JsonNullable<String> getSkills() {
        return skills;
    }

    public JsonNullable<String> getFeatures() {
        return features;
    }

    public JsonNullable<String> getSkinDefault() {
        return skinDefault;
    }

    public JsonNullable<String> getReleaseDate() {
        return releaseDate;
    }

    public JsonNullable<Integer> getRiotPointPrice() {
        return riotPointPrice;
    }

    public JsonNullable<Boolean> getInfluencePointPrice() {
        return influencePointPrice;
    }
}
