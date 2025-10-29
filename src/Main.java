import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GameItem> gameItemList = new ArrayList<>();
        GameItem weapon = new Weapon("Longsword", 2, 10, 15, ItemRarity.COMMON);
        GameItem armor = new Armor("Chainmail", 21, 30, 15, ItemRarity.RARE);

        gameItemList.add(weapon);
        gameItemList.add(armor);

        Action<GameItem> printName = item -> System.out.println("Name: " + item.getName());
        Action<GameItem> durabilityCheck = item -> {
            if (item instanceof Durable durable) {
                System.out.println(item.getName() + " durability: " + durable.getDurability());
            }
        };

        for (GameItem gameItem : gameItemList) {
            printName.perform(gameItem);
            durabilityCheck.perform(gameItem);
        }
    }
}
