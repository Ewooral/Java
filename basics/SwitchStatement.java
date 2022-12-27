
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        boolean isDone = false;
        while (!isDone) {

            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter a number: ");
                String input = scanner.nextLine();
                int monthNumber = Integer.parseInt(input);

                // if(monthNumber == 1){
                // System.out.println("The month is January");
                // }

                // if(monthNumber == 2){
                // System.out.println("The month is February");
                // }

                switch (monthNumber) {
                    case 1:
                        System.out.println("The month is January");
                        isDone = true;
                        break;
                    case 2:
                        System.out.println("The month is February");
                        isDone = true;
                        break;
                    case 3:
                        System.out.println("The month is March");
                        isDone = true;
                        break;

                    default:
                        System.out.println("You chose another month! Try again.");
                        break;
                }
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }

}
