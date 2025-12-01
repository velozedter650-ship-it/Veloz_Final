
/**
 * Write a description of class Veloz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a number between 1 and 100: ");

            if (scanner.hasNextInt()) {
                num = scanner.nextInt();

                if (num >= 1 && num <= 100) {
                    break;  // valid input, exit loop
                } else {
                    System.out.println("Number must be between 1 and 100. Try again.");
                }
            } else {
                System.out.println("That's not a valid number. Try again.");
                scanner.next(); // discard invalid input
            }
        }

        System.out.println("You entered: " + num);
        scanner.close();
    }
}