package javaBasis.lesson12.product;

import javaBasis.lesson12.utils.UserInputStaticScanner;

public class ProductDemo {

    public static void main(String[] args) {

        String name1 = inputName();
        Product product1 = createProduct(name1);

        String name2 = inputName();
        if (name2.equals(name1)) {
            System.out.println("Product with same name already exists. Cannot create product 2.");
            return;
        }
        Product product2 = createProduct(name2);

        String name3 = inputName();
        if (name3.equals(name1) || name3.equals(name2)) {
            System.out.println("Product with same name already exists. Cannot create product 3.");
            return;
        }
        Product product3 = createProduct(name3);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println(product3);

        UserInputStaticScanner.close();
    }

    private static String inputName() {
        return UserInputStaticScanner.inputText("Input product name : ");
    }

    private static Product createProduct(String name) {
        double price = UserInputStaticScanner.inputDouble("Input product price : ");
        int quantity = UserInputStaticScanner.inputInt("Input product quantity : ");
        return new Product(name, price, quantity);
    }

}