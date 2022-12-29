import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class AnnotationDefinition {
    // annotation
    @SuppressWarnings("unused") // this annotation takes the 'unused' parameter
    private String name;

    private int age;

    // constructor
    public AnnotationDefinition(String NAME, int AGE) {
        this.name = NAME;
        this.age = AGE;
    }

    // annotation
    @VeryImportant
    public void setAge(int age) {
        this.age = age;
    }

    // annotation
    @VeryImportant
    public int getAge() {
        return this.age;
    }

    // annotation
    @RunImmediately
    public void name() {
        System.out.println("My name is " + this.name);
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