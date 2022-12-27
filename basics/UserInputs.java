
import java.util.Scanner;

public class UserInputs {
    public static void main(String[] args) {

        // STRINGS
        StringBuilder newSb = new StringBuilder("Mango")
                .append("is ")
                .append("Sweet")
                .append("!");
        System.out.println(newSb);

        // lets combine Scanner and StringBuilder classes

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter value: ");
            String input = scanner.nextLine();
            System.out.println(input);

            newSb.delete(0, newSb.length());

            for (int i = 0; i < 3; i++) {
                input = scanner.nextLine();
                newSb.append(input + "\n");
            }
            System.out.println();
            System.out.println(newSb);

        }
    }
}
