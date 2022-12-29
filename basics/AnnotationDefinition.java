
/**  
 *   * ANNOTATION TUTORIALS ON YOUTUBE  
 *   ? https://youtu.be/DkZr7_c9ry8
 *   
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// ?  annotation
@VeryImportant
public class AnnotationDefinition {
    @ImportantString
    @SuppressWarnings("unused") // this annotation takes the 'unused' parameter
    public String maidenName;

    private String firstname;
    private String lastname;
    private int age;
    private String address;
    private String schoolStatus;

    // ? constructor
    public AnnotationDefinition(String FIRSTNAME, String LASTNAME, int AGE,
            String ADDRESS, String SCHOOLSTATUS, String MAIDENNAME) {
        this.firstname = FIRSTNAME;
        this.age = AGE;
        this.lastname = LASTNAME;
        this.address = ADDRESS;
        this.schoolStatus = SCHOOLSTATUS;
        this.maidenName = MAIDENNAME;
    }

    // ? annotation
    @RunImmediately
    public void getLastName() {
        System.out.println("Lastname: " + this.lastname);
    }

    public void getFirstName() {
        System.out.println("Firstname: " + this.firstname);
    }

    // ? annotation
    @RunImmediately(times = 3)
    public void getAge() {
        System.out.println(this.age);
    }

    // ? annotation
    @RunImmediately(times = 2)
    public void getSchoolStatus() {
        System.out.println("school status: " + this.schoolStatus);
    }

    // ? annotation
    @RunImmediately
    public void getAddress() {
        System.out.println("Address: " + this.address);
    }
}

// ! CREATE CUSTOM ANNOTATIONS
/**
 * @Target annotation allows to specify which kind
 *         of java element this annotation is valid to be used on
 *         ElementType.TYPE is for class, .METHOD is for methods
 * 
 * @ Runtime Rentention tells java to keep this annotation around
 * through the running of the program so that other code can use it while
 * the program is running
 */

// * annotation for both classes and methods
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@interface VeryImportant {

}

// * annotation for only methods
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RunImmediately {

    // ! add parameter to annotation
    // they can only be a primitive type, class type, array type, String type
    // default value can be passed as parameters
    int times() default 1;

}

// * annotation for only fields or intance variables
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface ImportantString {

}