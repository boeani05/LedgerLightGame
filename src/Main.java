public class Main {
    public static void main(String[] args) {
        Inventory inv = new Inventory();

        inv.addItem(new Weapon("Longsword", 1, 10, 9, ItemRarity.RARE));
        inv.addItem(new Armor("Chainmail", 2, 30, 15, ItemRarity.COMMON));

        try {
            try {
                inv.addItem(null);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
            }

            try {
                inv.getItemByName("nonexistent");
            } catch (ItemNotFoundException e) {
                System.out.println(e);
            }
        }

        finally {
            System.out.println("Inventory check complete");
        }
    }
}
