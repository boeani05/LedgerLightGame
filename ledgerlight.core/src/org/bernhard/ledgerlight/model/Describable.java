package org.bernhard.ledgerlight.model;

public interface Describable {
    void describe();

    default void printDescription() {
        describe();
    }

    static String format(String name, int qty) {
        return "You have " + qty + " piece(s) of " + name + ".";
    }
}
