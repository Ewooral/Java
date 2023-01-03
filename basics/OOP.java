import java.util.*;
import java.util.logging.Logger;
import java.lang.Object;

public class OOP {

    // member variables or fields or instance variables
    private int dollar = 11;
    private int cedi = 1;

    public static int gas = 20;
    ArrayList<String> food = new ArrayList<String>();

    // constructor with parameters
    // method overloading
    // having two constructors with different functionalities
    public OOP(int d, int c) {
        this.cedi = c;
        this.dollar = d;

    }

    // constructor with no parameters
    public OOP() {

    }

    private int dollarToCedi(int dollars) {
        return this.cedi * dollars;
    }

    public int cediToDollar(int cedis) {
        return this.dollar / cedis + this.dollarToCedi(cedis);
    }

    // this is like the built in __str__ method in python.
    // it converts the object to string
    public String toString() {
        return String.valueOf(this.food);
    }

    // getter
    public int getDollar() {
        return this.dollar;
    }

    // setter
    public void setDollar(int DOLLAR) {
        this.dollar = DOLLAR;
    }

    // getter
    public ArrayList<String> getFood() {
        return this.food;
    }

    // setter
    public void setFood(String Food) {
        this.food.add(Food);
    }

}

class Person extends OOP {
    private String name, gender, eyeColor;
    private int age, weight, height;

    public Person(int d, int c, String name, int age, int height,
            int weight, String eyeColor, String gender) {
        super(d, c);
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.gender = gender;
    }

    // method overloading
    public String getName() {
        return this.name;
    }

    public String getName(String lname) {
        return this.name + " " + lname;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getGender() {
        return this.gender;
    }

}

class Tester {
    public static void main(String[] args) {

        // instance of the class
        OOP oop = new OOP(100, 800);
        System.out.println(oop.cediToDollar(23));
        System.out.println("Dollar is: " + oop.getDollar());
        oop.setDollar(250);
        oop.setFood("Fufu");
        oop.setFood("Rice ");
        oop.setFood("Fish");
        oop.setFood("Water-Melon");
        oop.setFood("Agushie");

        System.out.println("Dollar is: " + oop.getDollar());
        System.out.println("Food: " + oop.getFood());

        System.out.println("..................");
        ArrayList<String> newFood = oop.getFood();

        newFood.remove(1);
        System.out.println(newFood);
        Iterator<String> i = newFood.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }

        testPerson();

    }

    @Test
    public static void testPerson() {

        Person p = new Person(25, 50, "Joe Q Author", 42, 173, 82, "Brown", "MALE");
        System.out.println("gas: " + OOP.gas);
        p.setFood("Peperoni");
        p.setFood("Mushroom");
        p.setFood("Agushie and Pepper soup");
        System.out.println("Food: " + p.food);
        System.out.println(p.getFood());

        // LOGGER CLASS
        Logger l = Logger.getLogger("TESTING...");
        l.info("Created Person object named: " + p.getName());

        assertEquals("Joe Q Author", p.getName());
        assertEquals(42, p.getAge());
        assertEquals(174, p.getHeight());
        assertEquals(80, p.getWeight());
        assertEquals("Brown", p.getEyeColor());
        assertEquals("MALE", p.getGender());

        System.out.println(p.getName());
        System.out.println(p.getName("Boahen"));
    }

    private static void assertEquals(Object message, Object message2) {
        if (message2.equals(message)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
