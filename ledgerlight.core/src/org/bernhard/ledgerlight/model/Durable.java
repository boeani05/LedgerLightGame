package org.bernhard.ledgerlight.model;

public interface Durable {
    int getDurability();
    Durable setDurability(int d);
}
