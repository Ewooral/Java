
public class DEBUGGER {
    public static void main(String[] args) {
        is123Array(2);
    }

    static void is123Array(int k) {
        StringBuilder sb = new StringBuilder();
        String alph = "abcdefgh";
        sb.append(alph);
        char f = sb.charAt(k);
        String b = alph.substring(k) + alph.substring(0, k);
        System.out.println(b + f);

    }

}

/*
 * 1 Write a function named hasNValues which takes an array and an integer n as
 * arguments. It returns true if all the elements of the array are one of n
 * different values.
 * 
 * If you are writing in Java or C#, the function signature is
 * int hasNValues(int[ ] a, int n)
 * 
 * If you are writing in C or C++, the function signature is
 * int hasNValues(int a[ ], int n, int len) where len is the length of a
 * 
 * Note that an array argument is passed by reference so that any change you
 * make to the array in your function will be visible when the function returns.
 * Therefore, you must not modify the array in your function! In other words,
 * your function should have no side effects.
 * 
 * Examples
 * if a is if n is return
 * {1, 2, 2, 1} 2 1 (because there are 2 different element values, 1 and 2)
 * {1, 1, 1, 8, 1, 1, 1, 3, 3} 3 1 (because there are 3 different element
 * values, 1, 3, 8)
 * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 10 1 (because there are 10 different element
 * values)
 * {1, 2, 2, 1} 3 0 (because there are 2 different element values, not 3 as
 * required)
 * {1, 1, 1, 8, 1, 1, 1, 3, 3} 2 0 (because there are 3 different element
 * values, not 2 as required)
 * {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10} 20 0 (because there are 10 different element
 * values, not 20 as required)
 * 
 * Hint: There are many ways to solve this problem. One way is to allocate an
 * array of n integers and add each unique element found in the array parameter
 * to it. If you add n elements to the array, return 1, otherwise return 0.
 * 
 * 
 * 
 * ..........................ANSWER............................................
 * public class HasNValues {
 * public static void main(String[] args) {
 * int[] arrayOfNumbers3 = { 1, 2, 2, 1 };
 * int num3 = 2;
 * 
 * int[] arrayOfNumbers2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
 * int num2 = 10;
 * 
 * int[] arrayOfNumbers1 = { 1, 1, 1, 8, 1, 1, 1, 3, 3 };
 * int num1 = 2;
 * 
 * int[] arrayOfNumbers = { 1, 2, 2, 1 };
 * int num = 3;
 * 
 * System.out.println(hasNValues(arrayOfNumbers, num));
 * System.out.println(hasNValues(arrayOfNumbers1, num1));
 * System.out.println(hasNValues(arrayOfNumbers2, num2));
 * System.out.println(hasNValues(arrayOfNumbers3, num3));
 * }
 * 
 * static int hasNValues(int[] a, int n) {
 * int len = a.length;
 * int total = 0;
 * if (n > len) {
 * return 0;
 * }
 * for (int i = 0; i < len; i++) {
 * int j;
 * for (j = 0; j < i; j++) {
 * if (a[i] == a[j])
 * break;
 * }
 * if (i == j) {
 * total++;
 * 
 * }
 * }
 * return total == n ? 1 : 0;
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 * 2 A 123 array is an array that contains multiple repetitions of the values 1,
 * 2, 3 in that order. For example {1, 2, 3, 1, 2, 3, 1, 2, 3} is a 123 array
 * but {1, 2, 3, 1, 2} is not. Write a function named is123Array which returns 1
 * if its array argument is a 123 array, otherwise it returns 0.
 * 
 * If you are programming in Java or C#, the function prototype is int
 * is123Array(int[ ] a)
 * 
 * If you are programing in C or C++, the function prototype is int
 * is123Array(int a[ ], int len) where len is the number of elements in a
 * 
 * More examples:
 * if a is return reason
 * {1, 2, 3, 3, 2, 1} 0 elements a[3], a[4], a[5] are not 1, 2, 3
 * {0, 1, 2, 3, 1, 2, 3} 0 elements a[0], a[1], a[2] are not 1, 2, 3
 * {1, 2, 3, 3, 2, 1, 1, 2, 3} 0 elements a[3], a[4], a[5] are not 1, 2, 3
 * {1, 2, 3} 1  
 * {} 0 must contain at least one 1, 2, 3 triad
 * 
 * 
 * .................................ANSWERS..................................
 * public class Is123Array {
 * public static void main(String[] args) {
 * 
 * System.out.println(is123Array(new int[] { 1, 2, 3, 3, 2, 1 }));
 * System.out.println(is123Array(new int[] { 0, 1, 2, 3, 1, 2, 3 }));
 * System.out.println(is123Array(new int[] { 1, 2, 3, 3, 2, 1, 1, 2, 3 }));
 * System.out.println(is123Array(new int[] { 1, 2, 3 }));
 * System.out.println(is123Array(new int[] {}));
 * }
 * 
 * static int is123Array(int[] a) {
 * if (a.length == 0 || a.length % 3 != 0) {
 * return 0;
 * }
 * 
 * for (int i = 0; i < a.length; i += 3) {
 * if (a[i] != 1 || a[i + 1] != 2 || a[i + 2] != 3) {
 * return 0;
 * }
 * }
 * 
 * return 1;
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * 
 *  
 * 
 * 3. An onion array is an array that satisfies the following condition for all
 * values of j and k:
 * if j>=0 and k>=0 and j+k+1=length of array and j!=k then a[j]+a[k] <= 10
 * 
 * Write a function named isOnionArray that returns 1 if its array argument is
 * an onion array and returns 0 if it is not.
 * 
 * Your solution must not use a nested loop (i.e., a loop executed from inside
 * another loop). Furthermore, once you determine that the array is not an onion
 * array your function must return 0; no wasted loops cycles please!
 * 
 * If you are programming in Java or C#, the function signature is
 * int isOnionArray(int[ ] a)
 * 
 * If you are programming in C or C++, the function signature is
 * int isOnionArray(int a[ ], int len) where len is the number of elements in
 * the array a.
 * 
 * 
 * 
 * 
 * .............................ANSWERS................................
 * 
 * 
 * public class OnionArray {
 * public static void main(String[] args) {
 * 
 * System.out.println(isOnionArray(new int[] { 1, 2, 19, 4, 5 }));
 * System.out.println(isOnionArray(new int[] { 1, 2, 3, 4, 15 }));
 * System.out.println(isOnionArray(new int[] { 1, 3, 9, 8 }));
 * System.out.println(isOnionArray(new int[] { 2 }));
 * System.out.println(isOnionArray(new int[] {}));
 * System.out.println(isOnionArray(new int[] { -2, 5, 0, 5, 12 }));
 * }
 * 
 * static int isOnionArray(int[] a) {
 * int j = 0;
 * int k = 0;
 * int finalSol = 0;
 * int midIdx = 0;
 * int OddorEven = a.length % 2;
 * 
 * if (OddorEven == 0) {
 * midIdx = a.length / 2 - 1;
 * } else {
 * midIdx = a.length / 2;
 * }
 * 
 * if (a.length < 2)
 * return 1;
 * 
 * for (int i = 0; i <= midIdx; i++) {
 * j = i;
 * k = a.length - i - 1;
 * 
 * if (j >= 0 && k >= 0 && j + k + 1 == a.length && j != k) {
 * if (a[j] + a[k] <= 10) {
 * finalSol = 1;
 * } else
 * return 0;
 * }
 * }
 * return finalSol;
 * }
 * 
 * }
 * 
 * 
 */

// DUKE UNIVERSITY ASSIGNMENT

/*
 * 
 * Perimeter Assignment: Part One
 * Introduction
 * In this assignment, you will complete the PerimeterAssignmentRunner class to
 * calculate lots of interesting facts about shapes. This class has been started
 * for you in the BlueJ project called PerimeterAssignmentRunner (this is the
 * same project file that we were looking at in the previous reading, so feel
 * free to open the one you downloaded for the last reading). This project also
 * contains several data files. In addition, you will need to look at the
 * documentation for the Shape class and the Point class, which we went over in
 * the last reading.
 * 
 * Our goals for this exercise are to:
 * 
 * 1a. Complete writing the method getNumPoints that has one parameter s that is
 * of type Shape. This method returns an integer that is the number of points in
 * Shape s.
 * 
 * 1b. Add code in the method testPerimeter to call getNumPoints and to print
 * the result.
 * 
 * 2a. Complete writing the method getAverageLength that has one parameter s
 * that is of type Shape. This method returns a number of type double that is
 * the calculated average of all the sides’ lengths in the Shape S.
 * 
 * 2b. Add code in the method testPerimeter to call the method getAverageLength
 * and to print out the result.
 * 
 * Discussion
 * Complete the method getNumPoints
 * For this section, we need to complete the code for the method getNumPoints.
 * We are instructed that the method has one parameter, s, that is a Shape-type
 * object. This makes sense with the other code we’ve seen in this project, as
 * the only shape-type object we’ve created is, in fact, named s. To understand
 * how to show what parameter a method has, check out the code review we did in
 * the last reading. (Hint: the getPerimeter method also has a parameter named s
 * that is of type shape, but the getPerimeter method returns a double-type
 * variable, whereas we want getNumPoints to return an int-type variable).
 * 
 * After passing the parameter along, we’ll need to write some language that
 * will allow for this method to return an int that is the number of points in
 * Shape s. This immediately tells us that at some point, we will need to
 * declare an int-type variable to return at the end of this method (review the
 * video about variables and types if you’re having trouble with variable
 * declaration). This variable will be a counter for the number of points within
 * a given shape, s, which means that it will need to be increased for each
 * point in the shape, s. This tells us quite a bit about how we might translate
 * that action into java syntax, namely that we’ll be using some sort of loop.
 * For more information about writing code that iterates over an entire object,
 * see the video “Seven Steps in Action: Translating to Code” and look into the
 * code review for this exercise (Hint: the getPerimeter method has both a for
 * each loop, and a variable that updates after each iteration).
 * 
 * Add Code in the Method testPerimeter to output the result
 * In this case, we’re simply looking to write some code that will output the
 * result of the getNumPoints method. This tells us that within the
 * testPerimeter method we’ll need to add a variable to correspond to the output
 * of the getNumPoints method. The prompt told us that this method is supposed
 * to output an int-type variable, which means that whatever variable we declare
 * here will also need to be int-type. We’ll then need to initialize it to the
 * output of the getNumPoints method for the shape s. After initialization,
 * we’ll just need to add some code that will cause the system to output some
 * text and our variable (Hint: the testPerimeter method already has examples of
 * all of these processes).
 * 
 * At this point, it’s worth compiling your code and running it on some of the
 * example text files included with the BlueJ project file. For the sake of this
 * example, we’ll only use the example1.txt. When you run your program on
 * example1.txt, it should tell you that the shape has four points. And if we
 * open the text file itself, we can see that the shape does indeed have four
 * points, so that checks out. You should run it on the other text files as
 * well, to verify that it does check for the number of points in the shape, and
 * does not just always output 4 points.
 * 
 * Complete the method getAverageLength
 * Before we can think about what code we would need to write to figure out the
 * average side length for the shape s, we need to understand exactly what we’re
 * trying to calculate, and then translate that to java syntax. In this case, a
 * couple of things that help us, we know that the way to calculate the average
 * side length is the (sum of all sides lengths) / (number of sides).
 * Additionally, we know that the number of sides is equal to the number of
 * points in a two dimensional shape. We already know how to code a method that
 * can calculate the perimeter of a shape, and we know how to code a method that
 * can count the number of points in a shape, so now it’s just a matter of
 * writing a method that can do both and return a double-type variable that is
 * the quotient of those two quantities.
 * 
 * One thing to keep in mind, however, is types. It’s important to remember that
 * when you’ll be doing operations on more than one variable, you may need to
 * make sure they’re the same type, or that you’re casting your variables
 * correctly for the operation you’re attempting. For more information on types
 * and casting, see the “Types” video. For example, the getPerimeter method uses
 * double-type variables, and the getNumPoints method uses int-type variables.
 * 
 * Add Code to testPerim to output the result of getAverageLength
 * You’ll do this almost exactly the same you did for the getNumPoints method.
 * 
 * At this point, it’s worth testing your program again, and when you compile
 * and run it on example1.txt, it should tell you that “the average length of a
 * side in your shape is 4.0”.
 * 
 * This is where we’ll leave off with this exercise, but you’ll want to make
 * sure you save all of your project files, as we’ll be using the exact same
 * project files for the next few activities.
 * 
 * 
 * 
 * 
 * .............................................................................
 * .......
 * Perimeter Assignment: Part Two
 * Introduction
 * In this assignment, you will complete the PerimeterAssignmentRunner class to
 * calculate lots of interesting facts about shapes. This class has been started
 * for you in the BlueJ project called PerimeterAssignmentRunner (this is the
 * same project file that you were using in the last exercise, so feel free to
 * open it up again and continue working). The goals for this exercise are as
 * follows:
 * 
 * 1a. Complete writing the method getLargestSide that has one parameter s that
 * is of type Shape. This method returns a number of type double that is the
 * longest side in the Shape S.
 * 
 * 1b. Add code in the method testPerimeter to call the method getLargestSide
 * and to print out the result.
 * 
 * 2a. Complete writing the method getLargestX that has one parameter s that is
 * of type Shape. This method returns a number of type double that is the
 * largest x value over all the points in the Shape s.
 * 
 * 2b. Add code in the method testPerimeter to call the method getLargestX and
 * to print out the result. Note if you were to select the file example1.txt,
 * then the largest x value should be 4.0.
 * 
 * Discussion
 * Complete the getLargestSide method and output the results
 * For this section, we’ve got to complete the getLargestSide method, which we
 * know has a parameter s, of type shape. We learned in the last assignment and
 * readings about how to show what kinds of parameters a method has, so make
 * sure to reference that if you’re having trouble remembering how to get
 * started. On paper, we’re simply trying to compare the length of all of the
 * sides of shape s, and report the largest side. This tells us that we’ll need
 * to be able to find the length of a side of a shape, but thankfully we already
 * know how to do that from the other methods we’ve written and the Shape Class
 * documentation (Hint: the length of a side of a shape is the distance between
 * two points of the shape).
 * 
 * Additionally, we know that we need to compare all of the sides of the shape,
 * which implies we will need to iterate through each side of the shape to find
 * its length. An important thing to remember when you’re thinking about
 * programming, is what your objective requirements are. In this case, we’re
 * only trying to find what the longest side is, so we only need to know if any
 * given side is the longest side. We know how to calculate the length of a
 * side, we know how to iterate through each point in a shape, we know how to
 * keep a running tally while iterating, and we know how to compare values (if
 * this is giving you trouble, revisit the video on conditionals). From here,
 * it’s simply putting it all together.
 * 
 * As always, when you’re done writing your code in the getLargestSide method,
 * remember to add the code to call the getLargestSide method in the
 * testPerimeter method and add the code to have the system print the output
 * (the same way we did in the last exercise). As always, this is a great time
 * to compile and test your code, and if you run this code using example1.txt as
 * your shape file, then the longest side should be 5.0.
 * 
 * Complete the getLargestX method and output the results
 * Once again, for this section we know how to show what type of parameter a
 * method has, and in this case we know that the getLargestX method will be
 * outputting a double-type variable, so that’s a great place to start. From
 * here, we know we’ll need to find the largest X value of any given point in
 * shape S, so we’ll need to iterate through the points of the shape s and
 * compare their x components (Hint: If you’re having trouble finding the x
 * component of a point, make sure to check the Point class documentation in the
 * course site). From here out, we know how to iterate through all the points in
 * a shape, compare their values, and keep track of the largest value.
 * 
 * As always in these activities, call your getLargestX method in the
 * testPerimeter method, and have the system output the results. If you run this
 * section of code with example1.txt, the Largest X will be 4.0.
 * 
 * This is where we’ll leave off with this exercise, but you’ll want to make
 * sure you save all of your project files, as we’ll be using the exact same
 * project files for the next few activities.
 * 
 * 
 * 
 * import edu.duke.*;
 * import java.io.File;
 * 
 * public class PerimeterAssignmentRunner {
 * public double getPerimeter (Shape s) {
 * // Start with totalPerim = 0
 * double totalPerim = 0.0;
 * // Start wth prevPt = the last point
 * Point prevPt = s.getLastPoint();
 * // For each point currPt in the shape,
 * for (Point currPt : s.getPoints()) {
 * // Find distance from prevPt point to currPt
 * double currDist = prevPt.distance(currPt);
 * // Update totalPerim by currDist
 * totalPerim = totalPerim + currDist;
 * // Update prevPt to be currPt
 * prevPt = currPt;
 * }
 * // totalPerim is the answer
 * return totalPerim;
 * }
 * 
 * public int getNumPoints (Shape s) {
 * int numPoints = 0;
 * for(Point p: s.getPoints()){
 * numPoints += 1;
 * }
 * return numPoints;
 * }
 * 
 * public double getAverageLength(Shape s) {
 * return getPerimeter(s) / getNumPoints(s);
 * }
 * 
 * public double getLargestSide(Shape s) {
 * // Start with totalPerim = 0
 * double largestSide = 0.0;
 * // Start wth prevPt = the last point
 * Point prevPt = s.getLastPoint();
 * // For each point currPt in the shape,
 * for (Point currPt : s.getPoints()) {
 * // Find distance from prevPt point to currPt
 * double currDist = prevPt.distance(currPt);
 * // Check if the current distance bigger than the largestSide, if so update
 * the largestSide
 * if(currDist > largestSide){
 * largestSide = currDist;
 * }
 * // Update prevPt to be currPt
 * prevPt = currPt;
 * }
 * return largestSide;
 * }
 * 
 * public double getLargestX(Shape s) {
 * int largestX = 0;
 * for(Point p: s.getPoints()){
 * if(p.getX() > largestX){
 * System.out.println(p.getX());
 * largestX = p.getX();
 * }
 * }
 * return largestX;
 * }
 * 
 * public double getLargestPerimeterMultipleFiles() {
 * double largestPer = 0.0;
 * DirectoryResource dir = new DirectoryResource();
 * for (File f : dir.selectedFiles()) {
 * FileResource fr = new FileResource(f);
 * Shape s = new Shape(fr);
 * if(getPerimeter(s) > largestPer){
 * largestPer = getPerimeter(s);
 * }
 * }
 * return largestPer;
 * }
 * 
 * public String getFileWithLargestPerimeter() {
 * File temp = null;
 * double largestPer = 0.0;
 * DirectoryResource dir = new DirectoryResource();
 * for (File f : dir.selectedFiles()) {
 * FileResource fr = new FileResource(f);
 * Shape s = new Shape(fr);
 * if(getPerimeter(s) > largestPer){
 * largestPer = getPerimeter(s);
 * temp = f;
 * }
 * }
 * return temp.getName();
 * }
 * 
 * public void testPerimeter () {
 * FileResource fr = new FileResource();
 * Shape s = new Shape(fr);
 * double length = getPerimeter(s);
 * int numPoints = getNumPoints(s);
 * double avgLen = getAverageLength(s);
 * double largestX = getLargestX(s);
 * double largestSide = getLargestSide(s);
 * System.out.println("perimeter = " + length);
 * System.out.println("number of points = " + numPoints);
 * System.out.println("average length = " + avgLen);
 * System.out.println("largest X = " + largestX);
 * System.out.println("largest side = " + largestSide);
 * }
 * 
 * public void testPerimeterMultipleFiles() {
 * System.out.println(getLargestPerimeterMultipleFiles());
 * }
 * 
 * public void testFileWithLargestPerimeter() {
 * System.out.println(getFileWithLargestPerimeter());
 * }
 * 
 * // This method creates a triangle that you can use to test your other methods
 * public void triangle(){
 * Shape triangle = new Shape();
 * triangle.addPoint(new Point(0,0));
 * triangle.addPoint(new Point(6,0));
 * triangle.addPoint(new Point(3,6));
 * for (Point p : triangle.getPoints()){
 * System.out.println(p);
 * }
 * double peri = getPerimeter(triangle);
 * System.out.println("perimeter = "+peri);
 * }
 * 
 * // This method prints names of all files in a chosen folder that you can use
 * to test your other methods
 * public void printFileNames() {
 * DirectoryResource dr = new DirectoryResource();
 * for (File f : dr.selectedFiles()) {
 * System.out.println(f);
 * }
 * }
 * 
 * public static void main (String[] args) {
 * PerimeterAssignmentRunner pr = new PerimeterAssignmentRunner();
 * // pr.testPerimeter();
 * // pr.testFileWithLargestPerimeter();
 * pr.testPerimeterMultipleFiles();
 * }
 * }
 */
