import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Ask the user to enter the price of the item
        // Check if input is a valid number (double)
        // If price >= 100 → shipping is $0
        // Else → shipping is 2% of the item price
        // Calculate total price (item + shipping)
        // Display shipping cost and total
        // If input is invalid, show an error

        Scanner in = new Scanner(System.in);
        double itemPrice;
        double shippingCost;
        double totalPrice;
        String trash;

        System.out.print("Enter the price of the item: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine(); // clear input buffer

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            System.out.println("Shipping cost: $" + String.format("%.2f", shippingCost));
            System.out.println("Total price: $" + String.format("%.2f", totalPrice));

        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
            System.out.println("Please run the program again and enter a valid number.");
        }
    }
}
