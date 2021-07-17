public class DamageSkills extends Skill {
    private double damage;

    public DamageSkills(int cost, String description, double damage) {
        super(cost, description);
        this.damage = damage;
    }

    public double getDamage() {
        return damage;
    }
}
