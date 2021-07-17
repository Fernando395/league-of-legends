public class Skill {
    private int cost;
    private String description;
    private String name;

    public Skill(int cost, String description, String name) {
        this.name = name;
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
