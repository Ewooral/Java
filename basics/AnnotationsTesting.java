import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// annotation
public class AnnotationsTesting {

    public static void main(String[] args) {

        // check for the presence of the annotation
        AnnotationDefinition nums = new AnnotationDefinition("Mary", 33);
        if (nums.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("Not very important");
        }

        nums.setAge(29);
        System.out.println(nums.getAge());

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

        // Instance of the AArrays class
        AArrays aa = new AArrays();
        System.out.println(aa.foodNum);
        System.out.println(aa.FamilySize);
        aa.getNumLength();
        aa.dontKnow();
    }

}
