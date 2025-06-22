package lesson21;

import javaBasis.lesson21.EvenNumbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersTest {

    @Test
    void evenNumbersArrayReturn() {
        EvenNumbers evenNumbers = new EvenNumbers();

        int[] arr = {3, 1, 5, 4, 8, 6, 9, 12, 16, 20};
        int[] expectedResult = {4, 8, 6, 12, 16, 20};
        int[] actualResult = evenNumbers.getEvenNumbers(arr);

        assertArrayEquals(expectedResult, actualResult);
    }

}