package model;

public class DamageSkill extends Skill {
    private double damage;

    public DamageSkill(int cost, String description, double damage, String name) {
        super(cost, description, name);
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}
