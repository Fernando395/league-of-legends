package org.example.league_of_legends.dto;
import org.openapitools.jackson.nullable.JsonNullable;

public class PartialUpdateSkinDto {

    private final JsonNullable<String> name = JsonNullable.undefined();
    private final JsonNullable<String> releaseDateOf = JsonNullable.undefined();
    private final JsonNullable<Integer> riotPointPrice = JsonNullable.undefined();
    private final JsonNullable<Boolean> obtainable = JsonNullable.undefined();

    public JsonNullable<String> getName() {
        return name;
    }

    public JsonNullable<String> getReleaseDateOf() {
        return releaseDateOf;
    }

    public JsonNullable<Integer> getRiotPointPrice() {
        return riotPointPrice;
    }

    public JsonNullable<Boolean> getObtainable() {
        return obtainable;
    }
}