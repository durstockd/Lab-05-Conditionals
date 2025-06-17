import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args) {
        // Prompt user to enter their age
        // Check if input is a valid integer
        // If valid, check if age >= 21
        //    If yes, print "You get a wristband."
        //    Otherwise, do nothing
        // If invalid input, print error message

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your age: ");

        if (in.hasNextInt()) {
            int age = in.nextInt();
            in.nextLine(); // clear buffer

            if (age >= 21) {
                System.out.println("You get a wrist band.");
            }
            // else do nothing if under 21
        } else {
            String trash = in.nextLine();
            System.out.println("Invalid input. You entered: " + trash);
            System.out.println("Please run the program again and enter a valid age.");
        }
    }
}
