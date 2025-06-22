package javaBasis.lesson10.pizza;

public class ExtraCalories {
    public static void main(String[] args) {

        int pizzaDiameter1 = 24;
        int pizzaDiameter2 = 28;
        double calories = 40;

        double calories1 = calculateCalories(pizzaDiameter1, calories);
        double calories2 = calculateCalories(pizzaDiameter2, calories);

        double extraCalories = calories2 - calories1;

        System.out.printf("Calories for %d cm pizza: %.2f\n", pizzaDiameter1, calories1);

        System.out.printf("Calories for %d cm pizza: %.2f\n", pizzaDiameter2, calories2);

        System.out.printf("Extra calories if you choose %d cm instead of %d cm: %.2f\n",
                pizzaDiameter2, pizzaDiameter1, extraCalories);


    }

    public static double calculateCalories(int diameter, double calories) {
        double area = 3.1415 * diameter * diameter / 4;
        return area * calories;
    }

}