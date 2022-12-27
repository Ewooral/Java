
import java.util.Arrays;

import Problem_Solving.CenteredArray;

public class Import_Modules {
    static String[] copyTo = { "a", "b", "c", "d", "e" };

    public static void main(String[] args) {
        int numbers1[] = { 3, 2, 1, 7, 5 };
        System.out.println(VariableTypes1.m);
        VariableTypes1.method();
        System.out.println(CenteredArray.middleElemen(numbers1));
        VariableTypes1.main(args);
        HelloWorld.main(args);

        Arrays.stream(copyTo)
                .map(coffee -> coffee + ",")
                .forEach(System.out::print);
    }

}
