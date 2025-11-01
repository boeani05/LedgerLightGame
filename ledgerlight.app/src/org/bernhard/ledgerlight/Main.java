package org.bernhard.ledgerlight;

import org.bernhard.ledgerlight.model.*;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Inventory inv1 = new Inventory();
        Weapon longsword = new Weapon("Longsword", 1, 10, 15, ItemRarity.COMMON);
        Armor chainmail = new Armor("Chainmail", 2, 20, 10, ItemRarity.RARE);

        inv1.addItem(longsword);
        inv1.addItem(chainmail);

        Optional<GameItem> item = inv1.getItemByName("Longsword");

        item.ifPresentOrElse(GameItem::describe, () -> System.out.println("Item not found!"));

        Optional<GameItem> item1 = inv1.getItemByName("Chainmail");

        item1
                .map(GameItem::getName)
                .map(String::toUpperCase)
                .ifPresentOrElse(System.out::println, () -> System.out.println("Nothing"));

        GameItem gameItem =
                inv1.getItemByName("Potion")
                        .orElseGet(() -> new Item("Fallback", 1));

        gameItem.describe();


    }
}
