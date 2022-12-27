# Install multiple java jdks and switch between them in linux
    https://towardsdatascience.com/install-and-run-multiple-java-versions-on-linux-using-sdkman-858571bce6cf


# There are three types of variables in Java:

    local variable
    instance variable
    static variable


## Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.


## Instance Variable
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

It is called an instance variable because its value is instance-specific and is not shared among instances.


## Static variable
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

``` java

public class VariableTypes1 {
    static int m = 100;// static variable 

    static void method() {
        int num = 90; // local variable
        System.out.println(num);
    }

    public static void main(String[] args) {
        int data = 50; // instance variable
        System.out.println(data);
        System.out.println(m);
        method();
    }
}

```


# There are two major classes of variables or data types in Java. Primitive type and Objects
  
  ## Primitive types ( Numbers, Characters, boolean values ) 
    They are stored in the fastest available memory for quick access
    data types names are all in lowercase
       - Note that a string is a complex object, not a primitive

    ``` java 
    int myVar = 5;
    int = data type 
    myVar = identifier

    ```
        DATA TYPE |   BITS  | MINIMUM | MAXIMUM |
        byte           8         -128       127
        short          16        -32,768    32,767
        int            32        -2B +      2B +
        long           64        -9.2E+18   9.22337E+18
        float          32 
        double         64

    All primitive data types have helper classes that support conversion and formatting tools
        
         DATA TYPE | HELPER CLASS 
         byte        Byte
         short       Short
         int         Integer
         long        Long
         float       Float
         double      Double 
    
    Each helper class is a member of a java package called **Java.lang**
    
``` Java
double doubleValue = 134.4d;
Double doubleObj = new Double(doubleValue); // instance of the Double helper class

byte byteValue = doubleObj.byteValue(); 
int intValue = doubleObj.intValue();
float floatValue = doubleObj.floatValue();
short shortValue = doubleObj.shortValue();
long longValue = doubleObj.longValue();
String stringValue = doubleObj.toString();

```

    primitive numeric variables default to 0.

```Java 

int myInt;
System.out.println(myInt); // returns 0

```

  ### Sometimes, there are inconsistencies in adding double values. For example
  ```Java 
  public static void main(String[] args){
      double value = 0.012;
      double pSum = value * value * value;
      System.out.println(pSum); // returns 0.036000000000000004
  }  
  ```

 **BigDecimals** is used to solve this inconsistency problem




### Conversion between types

1. Some types can be converted implicitly

```java
int x = 3;
double d = x;  // implicit conversion

```

2. Some types require an explicit cast

```java
double d = 3.14;
int x = (int)d;

```

3. Othes require method calls

```java
String s = "3";
int x = Integer.parseInt(s);
double y = Double.

```










  ### OPERATORS

  ### Incrementing and decrementing

  ```java
  int intValue = 10;

  intValue ++;
  intValue --;

  intValue += 1;
  intValue -= 1;
  intValue /= 1;
  intValue %= 1;
  intValue *= 1;

  ```
  ### Postfix vs. Prefix incrementing
  ```java
   // Postfix
    intValue ++
    intValue = 0

  // Prefix
    -- intValue 
  ```
### Logical Operators
* && => And
* || => Or
* ?: => Ternary(short-hand for if-then)

```java
  String s = condition ? trueValue : falseValue;
```


## Objects ()
    An object is an intance of a class
    Nonprimitive variables are references to objects
    Objects can have multiple references

    if you declare a variable without the static keyword, it means
    that it is an instance variable. An instance variable is not a member of a class but rather a member of an instance of a class.

    A String in Java is a complex Object. it is an instance of the String class
    (java.lang.String)    

    E.g. String string1 = new String("Hello");

    Strings can be declared in the ff ways
```java
    String string1 = new String("Hello");
    String string2 = "Hello"
```
    NB!!
*    A String is an array of characters in a particular object.
*    A String Object is immutable.
*    Resetting the value of a String creates a new object

          E.g. String cat = "Mosalah";
          cat = "Peter";


## Arrays..................................................................

An array is a container object that holds a fixed number of values of a single type
he length of an array is established when the array is created. After creation, its length is fixed. You have seen an example of arrays already, in the main method of the "Hello World!" application. This section discusses arrays in greater detail.

    Each item in an array is called an element, and each element is accessed by its numerical index. As shown in the preceding illustration, numbering begins with 0. The 9th element, for example, would therefore be accessed at index 8.

The following program, ArrayDemo, creates an array of integers, puts some values in the array, and prints each value to standard output.

```java
class ArrayDemo {
    public static void main(String[] args) {
        // declares an array of integers
        int[] anArray;

        // allocates memory for 10 integers
        anArray = new int[10];
           
        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;

        System.out.println("Element at index 0: "
                           + anArray[0]);
        System.out.println("Element at index 1: "
                           + anArray[1]);
        System.out.println("Element at index 2: "
                           + anArray[2]);
        System.out.println("Element at index 3: "
                           + anArray[3]);
        System.out.println("Element at index 4: "
                           + anArray[4]);
        System.out.println("Element at index 5: "
                           + anArray[5]);
        System.out.println("Element at index 6: "
                           + anArray[6]);
        System.out.println("Element at index 7: "
                           + anArray[7]);
        System.out.println("Element at index 8: "
                           + anArray[8]);
        System.out.println("Element at index 9: "
                           + anArray[9]);
    }
} 
```
The output from this program is:

    Element at index 0: 100
    Element at index 1: 200
    Element at index 2: 300
    Element at index 3: 400
    Element at index 4: 500
    Element at index 5: 600
    Element at index 6: 700
    Element at index 7: 800
    Element at index 8: 900
    Element at index 9: 1000


In a real-world programming situation, you would probably use one of the supported looping constructs to iterate through each element of the array, rather than write each line individually as in the preceding example. However, the example clearly illustrates the array syntax. You will learn about the various looping constructs `(for, while, and do-while)` in the Control Flow section.

# Declaring a Variable to Refer to an Array
The preceding program declares an array (named anArray) with the following line of code:

### declares an array of integers
    int[] anArray;

Like declarations for variables of other types, an array declaration has two components: the array's type and the array's name. An array's type is written as type[], where type is the data type of the contained elements; the brackets are special symbols indicating that this variable holds an array. The size of the array is not part of its type (which is why the brackets are empty). An array's name can be anything you want, provided that it follows the rules and conventions as previously discussed in the naming section. As with variables of other types, the declaration does not actually create an array; it simply tells the compiler that this variable will hold an array of the specified type.

Similarly, you can declare arrays of other types:

    byte[] anArrayOfBytes;
    short[] anArrayOfShorts;
    long[] anArrayOfLongs;
    float[] anArrayOfFloats;
    double[] anArrayOfDoubles;
    boolean[] anArrayOfBooleans;
    char[] anArrayOfChars;
    String[] anArrayOfStrings;

You can also place the brackets after the array's name:

### this form is discouraged
    float anArrayOfFloats[];

However, convention discourages this form; the brackets identify the array type and should appear with the type designation.

Creating, Initializing, and Accessing an Array
One way to create an array is with the new operator. The next statement in the ArrayDemo program allocates an array with enough memory for 10 integer elements and assigns the array to the anArray variable.

# create an array of integers
    anArray = new int[10];


If this statement is missing, then the compiler prints an error like the following, and compilation fails:

ArrayDemo.java:4: Variable anArray may not have been initialized.
The next few lines assign values to each element of the array:

anArray[0] = 100; // initialize first element
anArray[1] = 200; // initialize second element
anArray[2] = 300; // and so forth
Each array element is accessed by its numerical index:

System.out.println("Element 1 at index 0: " + anArray[0]);
System.out.println("Element 2 at index 1: " + anArray[1]);
System.out.println("Element 3 at index 2: " + anArray[2]);
Alternatively, you can use the shortcut syntax to create and initialize an array:

```java 
    int[] anArray = { 
    100, 200, 300,
    400, 500, 600, 
    700, 800, 900, 1000
};
```
Here the length of the array is determined by the number of values provided between braces and separated by commas.

You can also declare an array of arrays (also known as a multidimensional array) by using two or more sets of brackets, such as String[][] names. Each element, therefore, must be accessed by a corresponding number of index values.

In the Java programming language, a multidimensional array is an array whose components are themselves arrays. This is unlike arrays in C or Fortran. A consequence of this is that the rows are allowed to vary in length, as shown in the following MultiDimArrayDemo program:

```java
class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Smith", "Jones"}
        };
        // Mr. Smith
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Jones
        System.out.println(names[0][2] + names[1][1]);
    }
}
```
The output from this program is:

Mr. Smith
Ms. Jones
Finally, you can use the built-in length property to determine the size of any array. The following code prints the array's size to standard output:

 System.out.println(anArray.length);
Copying Arrays
The System class has an arraycopy method that you can use to efficiently copy data from one array into another:

    public static void arraycopy(Object src, int srcPos,
                             Object dest, int destPos, int length)
                             
    The two Object arguments specify the array to copy from and the array to copy to. The three int arguments specify the starting position in the source array, the starting position in the destination array, and the number of array elements to copy.

The following program, ArrayCopyDemo, declares an array of String elements. It uses the System.arraycopy method to copy a subsequence of array components into a second array:

``` java
class ArrayCopyDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = new String[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }
    }
}
```

The output from this program is:

Cappuccino Corretto Cortado Doppio Espresso Frappucino Freddo 


# Array Manipulations
Arrays are a powerful and useful concept used in programming. Java SE provides methods to perform some of the most common manipulations related to arrays. For instance, the ArrayCopyDemo example uses the arraycopy method of the System class instead of manually iterating through the elements of the source array and placing each one into the destination array. This is performed behind the scenes, enabling the developer to use just one line of code to call the method.

For your convenience, Java SE provides several methods for performing array manipulations (common tasks, such as copying, sorting and searching arrays) in the java.util.Arrays class. For instance, the previous example can be modified to use the copyOfRange method of the java.util.Arrays class, as you can see in the ArrayCopyOfDemo example. The difference is that using the copyOfRange method does not require you to create the destination array before calling the method, because the destination array is returned by the method:


``` java
class ArrayCopyOfDemo {
    public static void main(String[] args) {
        String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        }            
    }
}

```
As you can see, the output from this program is the same, although it requires fewer lines of code. Note that the second parameter of the copyOfRange method is the initial index of the range to be copied, inclusively, while the third parameter is the final index of the range to be copied, exclusively. In this example, the range to be copied does not include the array element at index 9 (which contains the string Lungo).

Some other useful operations provided by methods in the java.util.Arrays class are:

Searching an array for a specific value to get the index at which it is placed (the binarySearch method).

Comparing two arrays to determine if they are equal or not (the equals method).

Filling an array to place a specific value at each index (the fill method).

Sorting an array into ascending order. This can be done either sequentially, using the sort method, or concurrently, using the parallelSort method introduced in Java SE 8. Parallel sorting of large arrays on multiprocessor systems is faster than sequential array sorting.

Creating a stream that uses an array as its source (the stream method). For example, the following statement prints the contents of the copyTo array in the same way as in the previous example:

java.util.Arrays.stream(copyTo).map(coffee -> coffee + " ").forEach(System.out::print);  

See Aggregate Operations for more information about streams.

Converting an array to a string. The toString method converts each element of the array to a string, separates them with commas, then surrounds them with brackets. For example, the following statement converts the copyTo array to a string and prints it:

System.out.println(java.util.Arrays.toString(copyTo)); 
This statement prints the following:

[Cappuccino, Corretto, Cortado, Doppio, Espresso, Frappucino, Freddo] 




# CLASS

A class is a template that specifies how to make an object.

```java
 public class Point {

 }

```

## Field/Instance variable

    A variable named inside an object

    eg. private int x;

    private means only code inside the object can directly manipulate the field.

### Constructor 

A constructor specifies how to create objects of this class. The `constructor` has no `return` type. It is `named` the same as the `class`

```java
public void Point(int startx, int starty) {
    x = startx;
    y = starty;
 }
 
```
`Public` infront the `constructor` means any code can use the
consructor to create a `Point`.


### Methods

Methods are functions inside a class

``` java
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(Point otherpt) {
        int dx = x - otherpt.getX();
        int dy = y - otherpt.getY();

        return Math.sqrt(dx * dy + dy * dy);
    }

```

### Static methods

They don't act on any particular instance of a class. They
belong to the class in general.


### static void main()

Code execution start inside of the `main` method

```java
public static void main(String[] args) {
        // instance of the class
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("..............");
        System.out.println(p1.distance(p2));
    }
```

Here we create an instance of the class and assign to a variable.
When we create a `new` object off of a class and assign the object to a variable
the `arguments` passed as `parameters` into the new object are stored in a `heap`
note that any time `new keyword` is `invoked`, `data` is created in the `heap`

    Data in the heap does not disappear when the function returns destroying its frame.

After the variable p1, p2, we call the `constructor` method to initialize this `Point`. 
As with any call, we setup a `frame` and pass in `parameters`

constructors and methods take in an additional implicit paramter (`this`) which tells them which object they are operating on.



# Interface
    An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.


# The relationship between classes and interfaces

 A `class` `extends` another `class`, an `interface` `extends` another `interface`, but a `class` `implements`
 an interface.

```java

   public class Interface {
        interface Drawable{  
                void draw();  
                default void msg(){
                    System.out.println("default method");
                }  
            }  
        class Rectangle implements Drawable{  
            public void draw(){
                System.out.println("drawing rectangle");
            }  
        }  
        class TestInterfaceDefault{  
            public static void main(String args[]){  
                Drawable d=new Rectangle();  
                d.draw();  
                d.msg();  
            }
        } 

   } 
```





# Collections in Java

    The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

### Java Collection means a single unit of objects. 

Java Collection framework provides many 
        
        - interfaces (Set, List, Queue, Deque) and 
        - classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).

# What is Collection in Java

A Collection represents a single unit of objects, i.e., a group.
What is a framework in Java

    It provides readymade architecture.
    It represents a set of classes and interfaces.
    It is optional.

# What is Collection framework

The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

    1. Interfaces and its implementations, i.e., classes
    2. Algorithm



## Hierarachy of the collection framework

The `java.util` package contains all the `classes` and `interfaces` for the Collection framework.


# Methods of Collection interface

    There are many methods declared in the Collection interface. They are as follows:

1.	`public boolean add(E e)`	
        It is used to insert an element in this collection.
2.	`public boolean addAll(Collection<? extends E> c)`	
    It is used to insert the specified collection elements in the invoking collection.
3.	`public boolean remove(Object element)`	
    It is used to delete an element from the collection.
4.	`public boolean removeAll(Collection<?> c)`	
    It is used to delete all the elements of the specified collection from the invoking collection.
5.	`default boolean removeIf(Predicate<? super E> filter)`	
    It is used to delete all the elements of the collection that satisfy the specified predicate.
6.	`public boolean retainAll(Collection<?> c)`	
    It is used to delete all the elements of invoking collection except the specified collection.
7.	`public int size()`	
    It returns the total number of elements in the collection.
8.	`public void clear()`	
    It removes the total number of elements from the collection.
9.	`public boolean contains(Object element)`	
    It is used to search an element.
10.	`public boolean containsAll(Collection<?> c)`	
    It is used to search the specified collection in the collection.
11.	`public Iterator iterator()`	
    It returns an iterator.
12.	`public Object[] toArray()`	
    It converts collection into array.
13.	`public <T> T[] toArray(T[] a)`	    
    It converts collection into array. Here, the runtime type of the returned array is that of the specified array.
14.	`public boolean isEmpty()`	
    It checks if collection is empty.
15.	`default Stream<E> parallelStream()`	
    It returns a possibly parallel Stream with the collection as its source.
16.	`default Stream<E> stream()`	
    It returns a sequential Stream with the collection as its source.
17.	`default Spliterator<E> spliterator()`	
    It generates a Spliterator over the specified elements in the collection.
18.	`public boolean equals(Object element)`	
    It matches two collections.
19.	`public int hashCode()`	
    It returns the hash code number of the collection.




# Iterator interface
Iterator interface provides the facility of iterating the elements in a forward direction only.

# Methods of Iterator interface

There are only three methods in the Iterator interface. They are:

# No.	Method	Description
1.	public boolean `hasNext()`	It returns true if the iterator has more elements otherwise it returns false.
2.	public Object `next()`	It returns the element and moves the cursor pointer to the next element.
3.	public void  `remove()`	It removes the last elements returned by the iterator. It is less used.


# Iterable Interface

    The Iterable interface is the root interface for all the collection classes. 

    The Collection interface extends the Iterable interface and therefore all the 
    subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,

    Iterator<T> iterator()  

It returns the iterator over the elements of type T.

``` java
public class _ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(-12);
        al.add(3);
        al.add(78);

        // using iterator
        Iterator<Integer> i = al.iterator();
         while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

```






# List Interface

List interface is the child interface of Collection interface. It inhibits a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :

    List <data-type> list1= new ArrayList();  
    List <data-type> list2 = new LinkedList();  
    List <data-type> list3 = new Vector();  
    List <data-type> list4 = new Stack();  






...................................................................................................................
# OBJECT ORIENTED PROGRAMMING

# Encapsulation
     
    Is one of the four fundamental OOP concepts. The other three are inheritance, polymorphism, and abstraction.
    Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the 
    data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden
    from other classes, and can be accessed only through the methods of their current class. 
    Therefore, it is also known as data hiding.

## To achieve encapsulation in Java 

    Declare the variables of a class as private.

Provide public setter and getter methods to modify and view the variables values.

Example
Following is an example that demonstrates how to achieve Encapsulation in Java −

/* File name : EncapTest.java */
``` java
public class EncapTest {
   private String name;
   private String idNum;
   private int age;

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge( int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum( String newId) {
      idNum = newId;
   }
}
```
The public `setXXX()` and `getXXX()` methods are the access points of the 
instance variables of the EncapTest class. Normally, these methods are referred as 
`getters` and `setters`. Therefore, any class that wants to access the variables should ...............
access them through these getters and setters.

The variables of the EncapTest class can be accessed using the following program −


```java
/* File name : RunEncap.java */
public class RunEncap {

   public static void main(String args[]) {
      EncapTest encap = new EncapTest();
      encap.setName("James");
      encap.setAge(20);
      encap.setIdNum("12343ms");

      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
   }
}
```
This will produce the following result −

### Output
    Name : James Age : 20


## Benefits of Encapsulation
The fields of a class can be made read-only or write-only.

A class can have total control over what is stored in its fields.