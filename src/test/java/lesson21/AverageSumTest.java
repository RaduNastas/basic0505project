package lesson21;

import javaBasis.lesson21.AverageSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AverageSumTest {

    @Test
    void averageOfArrayIsCorrectly() {
        AverageSum averageSum = new AverageSum();

        int[] array = {2, 4, 6, 8};
        double expectedResult = 5.0;
        double actualResult = averageSum.getAverageSum(array);

        assertEquals(expectedResult, actualResult);
    }

}