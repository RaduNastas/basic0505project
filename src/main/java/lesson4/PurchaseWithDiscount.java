package lesson4;

/**
 * Let's say the price of product A is normally €1000 and product B is €500.
 * If a customer buys the products together, they get a €100 discount on the entire purchase.
 * Display a variable that corresponds to the discounted price of A+B.
 * Separately display the discount amount from this purchase.
 */

public class PurchaseWithDiscount {

    public static void main(String[] args) {
        int productA = 1000;
        int productB = 500;
        int discount = 100;
        int result = productA + productB - discount; // 1000 + 500 - 100 = 1400

        System.out.println("The total price for products and discount is: " + result); // 1400
        System.out.println("The discount amount is: " + discount);// 100
    }

}