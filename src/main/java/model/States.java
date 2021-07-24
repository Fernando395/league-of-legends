package model;

public class States {
    private int health;
    private String resourceType;
    private int resourceAmount;
    private int armor;
    private int attackDamage;
    private int magicResist;
    private int moveSpeed;
    private int attackRange;
    private double attackSpeed;

    States(int health, String resourceType, int resourceAmount, int armor, int attackDamage, int magicResist, int moveSpeed, int attackRange, double attackSpeed) {
        this.health = health;
        this.resourceType = resourceType;
        this.resourceAmount = resourceAmount;
        this.armor = armor;
        this.attackDamage = attackDamage;
        this.magicResist = magicResist;
        this.moveSpeed = moveSpeed;
        this.attackRange = attackRange;
        this.attackSpeed = attackSpeed;
    }

    public int getArmor() {
        return armor;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public int getHealth() {
        return health;
    }

    public int getMagicResist() {
        return magicResist;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public int getResourceAmount() {
        return resourceAmount;
    }

    public String getResourceType() {
        return resourceType;
    }
}
