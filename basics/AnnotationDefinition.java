import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// annotation
@VeryImportant
public class AnnotationDefinition {
    // annotation
    @SuppressWarnings("unused") // this annotation takes the 'unused' parameter
    private String firstname;

    private String lastname;
    private int age;
    private String address;
    private String schoolStatus;

    // constructor
    public AnnotationDefinition(String FIRSTNAME, String LASTNAME, int AGE,
            String ADDRESS, String SCHOOLSTATUS) {
        this.firstname = FIRSTNAME;
        this.age = AGE;
        this.lastname = LASTNAME;
        this.address = ADDRESS;
        this.schoolStatus = SCHOOLSTATUS;
    }

    // annotation
    @RunImmediately
    public void getLastName() {
        System.out.println("Lastname: " + this.lastname);
    }

    public void getFirstName() {
        System.out.println("Firstname: " + this.firstname);
    }

    // annotation
    @VeryImportant
    public int getAge() {
        return this.age;
    }

    // annotation
    @RunImmediately
    public void getSchoolStatus() {
        System.out.println("school status: " + this.schoolStatus);
    }

    // annotation
    @RunImmediately
    public void getAddress() {
        System.out.println("Address: " + this.address);
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