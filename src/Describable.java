public interface Describable {
    String describe();

    default void printDescription() {
        System.out.println(describe());
    }

    static String format(String name, int qty) {
        return "You have " + qty + " piece(s) of " + name + ".";
    }
}
