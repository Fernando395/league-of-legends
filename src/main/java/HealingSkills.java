public class HealingSkills extends Skill {
    private double healing;

    public HealingSkills(int cost, String description, double healing) {
        super(cost, description);
        this.healing = healing;
    }

    public double getHealing() {
        return healing;
    }
}
