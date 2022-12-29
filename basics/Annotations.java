import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@VeryImportant
public class Annotations {

    // annotations
    @SuppressWarnings("unused")
    private static int num;
    private static int age;

    public static void main(String[] args) {
        age = 29;
        System.out.println(age);
    }
}

// custom annotation
/*
 * @Target annotation allows to specify which kind
 * of java element this annotation is valid to be used on
 * ElementType.TYPE is for class, .METHOD is for methods
 * 
 * @ Runtime Rentention tells java to keep this annotation around
 * through the running of the program so that other code can use it while
 * the program is running
 */
@Target(ElementType.TYPE) // used on class
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {

}