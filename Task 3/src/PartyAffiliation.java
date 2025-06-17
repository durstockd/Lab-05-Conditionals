import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        // Prompt user to enter party affiliation (D, R, I)
        // Read input as String and convert to uppercase
        // Use cascaded if to check:
        //   If D => print "You get a Democratic Donkey."
        //   Else if R => print "You get a Republican Elephant."
        //   Else if I => print "You get an Independent Person."
        //   Else => print "You get Other."

        Scanner in = new Scanner(System.in);
        System.out.print("Enter your party affiliation (D, R, I): ");
        String input = in.nextLine().trim().toUpperCase();

        if (input.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (input.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (input.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}
