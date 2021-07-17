import java.util.ArrayList;

public class Champion {
    private String name;
    private String position;
    private States states;
    private ArrayList<Skill> skills;
    private Features features;

    public Champion(String name, String position, ArrayList<Skill> skills, States states, Features features) {
        this.name = name;
        this.position = position;
        this.skills = skills;
        this.states = states;
        this.features = features;
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
}
