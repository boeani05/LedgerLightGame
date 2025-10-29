public class BindingDemo {
    public static void printName(GameItem item) {
        System.out.println("This item has the name: " + item.getName());
    }

    public void showDescription(GameItem item) {
        System.out.println(item.describe());
    }
}
