package org.bernhard.ledgerlight.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AuthorInfo(name = "Bernhard", date = "30/10/2025")
public class Inventory {
    private final List<GameItem> gameItems;

    public Inventory() {
        gameItems = new ArrayList<>();
    }

    public void addItem(GameItem gameItem) {
        GameItem validated = Optional.ofNullable(gameItem)
                .filter(i -> i.getName() != null && !i.getName().isBlank())
                .filter(i -> i.getQuantity() > 0)
                .orElseThrow(() -> new IllegalArgumentException("Invalid item!"));
        gameItems.add(validated);
    }

    public Optional<GameItem> getItemByName(String name) {

        if (name == null || name.isBlank()) return Optional.empty();

        for (GameItem gameItem : gameItems) {
            if (gameItem.getName().equalsIgnoreCase(name)) {
                return Optional.of(gameItem);
            }
        }
        return Optional.empty();
    }

    public void forEach(Action<GameItem> action) {
        for (GameItem item : gameItems) {
            action.perform(item);
        }
    }
}
