package org.bernhard.ledgerlight.model;

public enum Difficulty {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private final int durabilityCost;

    Difficulty(int durabilityCost) {
        this.durabilityCost = durabilityCost;
    }

    public int getDurabilityCost() {
        return durabilityCost;
    }
}
