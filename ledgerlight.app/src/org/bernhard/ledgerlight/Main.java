package org.bernhard.ledgerlight;

import org.bernhard.ledgerlight.model.ItemRarity;
import org.bernhard.ledgerlight.model.Weapon;

public class Main {
    public static void main(String[] args) {
        Weapon longsword = new Weapon("Longsword", 1, 20, 5, ItemRarity.RARE);
        System.out.println(longsword.describe());
    }
}
