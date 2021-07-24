package org.example.league_of_legends.model;

public class Features {
    private String function;
    private String difficulty;
    private String story;
    private String attackType;

    public Features(String function, String difficulty, String story, String attackType){
        this.function = function;
        this.difficulty = difficulty;
        this.story = story;
        this.attackType = attackType;
    }

    public String getAttackType() {
        return attackType;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getFunction() {
        return function;
    }

    public String getStory() {
        return story;
    }
}
