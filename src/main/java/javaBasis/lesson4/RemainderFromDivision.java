package javaBasis.lesson4;
/**
 * What numbers can be obtained as a remainder from dividing any integer by 2? By 3?
 * Show this with specific examples.
 */

public class RemainderFromDivision {

    public static void main(String[] args) {
        int number1 = 9;
        int number2 = 7;
        int remainder1 = number1 % 3; // 9 % 3 = 0
        int remainder2 = number2 % 3; // 7 % 3 = 1
        System.out.println("Remainder from division of three is: " + remainder1);
        System.out.println("Remainder from division of three is: " + remainder2);

        int number3 = 6;
        int number4 = 5;
        int remainder3 = number3 % 2; // 6 % 2 = 0
        int remainder4 = number4 % 2; // 5 % 2 = 1
        System.out.println("Remainder from division of two is: " + remainder3);
        System.out.println("Remainder from division of two is: " + remainder4);
    }

}