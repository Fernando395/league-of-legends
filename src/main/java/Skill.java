public class Skill {
    private int cost;
    private String description;

    public Skill(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
