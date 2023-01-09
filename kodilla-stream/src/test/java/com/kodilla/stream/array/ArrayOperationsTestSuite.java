package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[] {1, 5, 6, 1, 4, 1, 5, 3, 4, 1, 1, 5, 6, 1, 4, 1, 5, 3, 4, 1};

        //When
        double avr = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(3.1, avr);
    }
}
