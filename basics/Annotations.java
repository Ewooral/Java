import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotation
@VeryImportant
public class Annotations {

    // annotation
    @SuppressWarnings("unused")
    private int num;
    private int age;

    public static void main(String[] args) {
        testCodes();
    }

    public void setAge(int age) {
        this.age = age;
    }

    // annotation
    @VeryImportant
    public int getAge() {
        return this.age;
    }

    public static void testCodes() {

        // check for the presence of the annotation
        Annotations nums = new Annotations();
        if (nums.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This thing is very important");
        } else {
            System.out.println("Not very important");
        }
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