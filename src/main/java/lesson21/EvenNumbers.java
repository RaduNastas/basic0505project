package lesson21;

public class EvenNumbers {

    public int[] getEvenNumbers(int[] array) {
        int count = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                count++;
            }
        }
        int[] evenArray = new int[count];
        int index = 0;
        for (int number : array) {
            if (number % 2 == 0) {
                evenArray[index++] = number;
            }
        }
        return evenArray;
    }

}