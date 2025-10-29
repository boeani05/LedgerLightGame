public class ValueReferenceDemo {
    public static void changePrimitive(int number) {
        number = 999;
        System.out.println("[inside] number set to 999");
    }

    public static void changeObject(Weapon weapon) {
        weapon.setDurability(weapon.getDurability() - 5);
        System.out.println("[inside] reduced durability by 5");
    }
}
