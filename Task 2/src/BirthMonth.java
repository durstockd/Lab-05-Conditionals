import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {
        // Ask user to enter birth month (1-12)
        // Check if input is an integer
        // If valid integer, check if it is in range 1 to 12
        //   If in range: print "Your birth month is: N"
        //   Else: print "You entered an incorrect month value: N"
        // If not an integer, print error message and exit

        Scanner in = new Scanner(System.in);
        int month;
        String trash;

        System.out.print("Enter your birth month (1-12): ");

        if (in.hasNextInt()) {
            month = in.nextInt();
            in.nextLine(); // clear the buffer

            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month);
            } else {
                System.out.println("You entered an incorrect month value: " + month);
            }
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input. You entered: " + trash);
            System.out.println("Run the program again and enter a valid number between 1 and 12.");
        }
    }
}