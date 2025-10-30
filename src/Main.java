import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {
        Class<?> c = Inventory.class;

        Annotation[] annotations = c.getAnnotations();

        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
