package javaBasis.lesson6.purchase;

/**
 * Let's say the price of product A is usually 1000 euros, and product B is 500 euros.
 * A customer buys products together, and they are discounted by 100 euros for the entire purchase.
 * Display a variable that corresponds to the price of the sum of A+B with a discount.
 * Separately display the amount of the discount from this purchase.
 * Create a separate method to calculate the total purchase amount
 * getTotalPrice(double priceA, double priceB, double discount)
 */

public class PurchaseWithDiscount {

    public void getTotalPrice(double priceA, double priceB, double discount) {
        double result = priceA + priceB - discount;
        System.out.printf("Total price after discount: %.2f €%n", result);
        System.out.printf("Discount applied: %.2f €%n", discount);
    }

}