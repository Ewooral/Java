import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// annotation
public class AnnotationsTesting {

    public static void main(String[] args) {
        System.out.println(".................");
        // check for the presence of the annotation
        AnnotationDefinition nums = new AnnotationDefinition("Mary", "Asante", 33, "Koforidua", "Completed");
        if (nums.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("Not very important");
        }

        // loop thru class, if a method is annotated with RunImmediately, Run it
        for (Method method : nums.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                try {
                    method.invoke(nums);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }

    }

}
