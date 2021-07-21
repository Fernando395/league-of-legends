import java.util.ArrayList;

public class Champion {
    private String name;
    private String position;
    private States states;
    private ArrayList<Skill> skills;
    private Features features;
    private Skin skin;
    private String releaseDateOf;
    private int storePrice;

    public Champion(String name, String position, ArrayList<Skill> skills, States states, Features features, Skin skin, String releaseDateOf, int storePrice) {
        this.name = name;
        this.position = position;
        this.skills = skills;
        this.states = states;
        this.features = features;
        this.skin = skin;
        this.releaseDateOf = releaseDateOf;
        this.storePrice = storePrice;
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

    public int getStorePrice() {
        return storePrice;
    }

    public Skin getSkin() {
        return skin;
    }
}
