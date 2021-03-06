package ru.kordum.totemDefender.common.config;

public class ConfigUpgrade {
    private float attackSpeed;
    private float damage;
    private int radius;
    private boolean isPercent;

    //---------------------------------------------------------------------------
    //
    // CONSTRUCTOR
    //
    //---------------------------------------------------------------------------

    public ConfigUpgrade(float attackSpeed, float damage, int radius) {
        this(attackSpeed, damage, radius, false);
    }

    public ConfigUpgrade(float attackSpeed, float damage, int radius, boolean isPercent) {
        this.attackSpeed = attackSpeed;
        this.damage = damage;
        this.radius = radius;
        this.isPercent = isPercent;
    }

    //---------------------------------------------------------------------------
    //
    // ACCESSORS
    //
    //---------------------------------------------------------------------------

    public float getAttackSpeed() {
        return attackSpeed;
    }

    public float getDamage() {
        return damage;
    }

    public int getRadius() {
        return radius;
    }

    public boolean isPercent() {
        return isPercent;
    }
}
