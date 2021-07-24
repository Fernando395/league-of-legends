package model;

public class HealingSkill extends Skill {
    private double healing;

    public HealingSkill(int cost, String description, double healing, String name) {
        super(cost, description, name);
        this.healing = healing;
    }

    public double getHealing() {
        return healing;
    }
}
