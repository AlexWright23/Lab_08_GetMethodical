import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalCost = 0.0;

        do {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            totalCost += itemPrice;

            System.out.print("Do you have more items to add? [Y/N]: ");
        } while (SafeInput.getYNConfirm(in, ""));

        System.out.printf("Total cost of items: $%.2f%n", totalCost);

    }
}