package org.bernhard.ledgerlight.model;

public class Armor extends Item implements Describable, Durable {
    private final int defense;
    private int durability;
    private final ItemRarity rarity;

    public Armor(String name, int quantity, int defense, int durability, ItemRarity rarity) {
        super(name, quantity);
        this.defense = defense;
        this.durability = durability;
        this.rarity = rarity;
    }

    public int getDefense() {
        return defense;
    }

    @Override
    public void describe() {
        System.out.printf("This armor (%s (%s) x%d) has a defense of %d and a durability of %d.%n", getName(), getRarity(), getQuantity(), getDefense(), getDurability());
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public Armor setDurability(int durability) {
        this.durability = durability;
        return this;
    }

    public ItemRarity getRarity() {
        return rarity;
    }
}
