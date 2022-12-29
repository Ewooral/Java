import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// annotation
@VeryImportant
public class Annotations {

    public static void main(String[] args) {

        // check for the presence of the annotation
        RunCodes nums = new RunCodes("Mary", 33);
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
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }
    }

}

class RunCodes {
    // annotation
    @SuppressWarnings("unused") // this annotation takes the 'unused' parameter
    private String name;
    private int age;

    public RunCodes(String NAME, int AGE) {
        this.name = NAME;
        this.age = AGE;
    }

    @VeryImportant
    public void setAge(int age) {
        this.age = age;
    }

    // annotation
    @RunImmediately
    public int getAge() {
        return this.age;
    }

    @RunImmediately
    public void name() {
        System.out.println("My name is Elijah ");
    }

}

// CREATE CUSTOM ANNOTATIONS
/*
 * @Target annotation allows to specify which kind
 * of java element this annotation is valid to be used on
 * ElementType.TYPE is for class, .METHOD is for methods
 * 
 * @ Runtime Rentention tells java to keep this annotation around
 * through the running of the program so that other code can use it while
 * the program is running
 */
@Target({ ElementType.TYPE, ElementType.METHOD }) // used on class
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {

}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunImmediately {

}