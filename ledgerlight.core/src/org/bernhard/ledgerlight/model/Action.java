package org.bernhard.ledgerlight.model;

@FunctionalInterface
public interface Action<T> {
    void perform(T item);

    default void log(T item) {
        System.out.println("Action performed on: " + item.getClass().getSimpleName());
    }
}
