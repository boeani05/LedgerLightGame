package org.bernhard.ledgerlight.model;

public class Weapon extends Item implements Describable, Durable {
    private StatBlock stats;
    private int durability;
    private final ItemRarity rarity;

    public Weapon(String name, int quantity, int damage, int durability, ItemRarity rarity) {
        super(name, quantity);
        this.durability = durability;
        this.rarity = rarity;
        this.stats = new StatBlock(damage, 0);
    }

    public int getDamage() {
        return stats.damage();
    }

    public Weapon setDamage(int damage) {
        if (damage <= 0) {
            throw new IllegalArgumentException("Such values are not allowed!");
        }
        this.stats = new StatBlock(damage, stats.defense());
        return this;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public Weapon setDurability(int durability) {
        if (durability <= 0) {
            throw new IllegalArgumentException("Such values are not allowed!");
        }
        this.durability = durability;
        return this;
    }

    @Override
    public Weapon setName(String name) {
        super.setName(name);
        return this;
    }

    @Override
    public Weapon setQuantity(int quantity) {
        super.setQuantity(quantity);
        return this;
    }

    @Override
    public void describe() {
        System.out.println("This weapon (" + getName() + " x" + getQuantity() +
                ") deals " + getDamage() + " damage and has a durability of " + getDurability() + ".");
    }

    public void swing(Difficulty durabilityCode) {
        durability = getDurability() - durabilityCode.getDurabilityCost();
        System.out.println("Swinging for practice...");
    }

    public ItemRarity getRarity() {
        return rarity;
    }

    public int attack() {
        return getDamage();
    }

    public int attack(int multiplier) {
        return getDamage() * multiplier;
    }

    public int attack(String style) {
        return switch (style) {
            case "heavy" -> Math.toIntExact(Math.round(getDamage() * 1.5));
            case "quick" -> Math.toIntExact(Math.round(getDamage() * 0.75));
            default -> getDamage();
        };
    }
}
