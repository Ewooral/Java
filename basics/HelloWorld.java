
import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) {
        // FLOATS
        // float ab = 0.0f;
        int a = 4;
        int b = 5;
        float sum = (float) a + b; // it is imperative that you cast one of the operands to
                                   // float when dealing with floating point numbers

        int num = (int) Math.pow(a, 2);
        System.out.println("Hey, " + num);

        // DOUBLES
        // double c = 0.0;
        String name = "Elijah";
        // float j = 3.3f;
        // double d = 4.0;
        // double e = 5.0;
        // float Sum2 = (float)(c + d + e);

        System.out.println(sum);
        System.out.println(name);
    }

}
