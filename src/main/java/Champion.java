import java.util.ArrayList;

public class Champion {
    private String name;
    private String position;
    private ArrayList<States> states;
    private ArrayList<Skill> skills;

    public Champion(String name, String position, ArrayList<Skill> skills, ArrayList<States> states) {
        this.name = name;
        this.position = position;
        this.skills = skills;
        this.states = states;
    }

}
