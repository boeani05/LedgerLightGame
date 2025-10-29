public class Main {
    public static void main(String[] args) {
        int x = 10;
        Weapon longsword = new Weapon("Longsword", 2, 15, 20, ItemRarity.EPIC);

        System.out.println(x);
        System.out.println(longsword.getDurability());

        ValueReferenceDemo.changePrimitive(x);
        ValueReferenceDemo.changeObject(longsword);

        System.out.println(x);
        System.out.println(longsword.getDurability());
    }
}
