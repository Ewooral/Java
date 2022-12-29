import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// annotation
public class AnnotationsTesting {

    public static void main(String[] args) {
        System.out.println(".................");
        // check for the presence of the annotation
        AnnotationDefinition nums = new AnnotationDefinition("Mary", "Asante", 33,
                "Koforidua", "Completed", "amihere");

        if (nums.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("Not very important");
        }

        // loop thru class, if a method is annotated with RunImmediately, Run it
        for (Method method : nums.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                try {

                    // number of times we invoke the said method
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    for (int i = 0; i < annotation.times(); i++) {
                        method.invoke(nums);
                    }

                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }

            }
        }

        for (Field field : nums.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                try {
                    Object objectValue = field.get(nums);

                    if (objectValue instanceof String stringValue) {
                        System.out.println(stringValue.toUpperCase());
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
