import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.List;

@Deprecated
@SuppressWarnings("deprecated")
@AuthorInfo(name = "Bernhard", date = "30/10/2025")
public class Inventory {
    private final List<GameItem> gameItems;

    public Inventory() {
        gameItems = new ArrayList<>();
    }

    public void addItem(GameItem gameItem) {
        if (gameItem == null) {
            throw new IllegalArgumentException("Item cannot be null");
        }
        gameItems.add(gameItem);
    }

    public GameItem getItemByName(String name) throws ItemNotFoundException {
        for (GameItem item : gameItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        throw new ItemNotFoundException("Item " + name + " has not been found!");
    }

    public void forEach(Action<GameItem> action) {
        for (GameItem item : gameItems) {
            action.perform(item);
        }
    }
}
