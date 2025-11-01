package org.bernhard.ledgerlight.model;

public abstract class GameItem {
    private String name;
    private int quantity;
    private static int NEXT_ID = 0;
    private final int id;

    // static initializer – runs once
    static {
        System.out.println("[BOOT] Loading item system...");
    }

    // instance initializer – runs for each object
    {
        id = ++NEXT_ID;
    }

    // constructor
    public GameItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
        System.out.println("Created " + this.getClass().getSimpleName() + "#" + this.id + " (" + this.name + ")");
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public GameItem setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Enter a valid value!");
        }
        this.name = name;
        return this;
    }

    public int getQuantity() {
        return quantity;
    }

    public GameItem setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Enter a valid value!");
        }
        this.quantity = quantity;
        return this;
    }

    public int getId() {
        return id;
    }

    public void describe() {
        System.out.printf("You have x%d of %s!\n%n", this.quantity, this.name);
    }
}
