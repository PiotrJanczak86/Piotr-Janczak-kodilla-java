package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculator() {
        //Given & When
        double addResult = calculator.add(5.0, 10.0);
        double subResult = calculator.sub(5.0, 10.0);
        double mulResult = calculator.mul(5.0, 10.0);
        double divResult = calculator.div(5.0, 10.0);
        //Then
        assertEquals(15.0, addResult);
        assertEquals(-5.0, subResult);
        assertEquals(50.0, mulResult);
        assertEquals(0.5, divResult);
    }
}
