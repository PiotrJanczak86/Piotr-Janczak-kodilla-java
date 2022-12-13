package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.*;
import static java.util.Arrays.asList;


public class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("checking if OddNumbersExterminator works when the list it is given is empty")

    @Test
    void testOddNumbersExterminatorEmptyList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> i0 = new ArrayList<>();
        List<Integer> i1 = exterminator.exterminate(i0);
        List<Integer> i2 = new LinkedList<>();
        Assertions.assertEquals(i1, i2);
    }

    @DisplayName("checking if new ArrayList created by OddNumbersExterminator is the same as predefined list of even numbers")

    @Test
    void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        List<Integer> i0 = new ArrayList<>(asList(1, 2, 3, 4, 5, 6));
        List<Integer> i1 = exterminator.exterminate(i0);
        List<Integer> i2 = new LinkedList<>(asList(2, 4, 6));
        Assertions.assertEquals(i1, i2);
    }
}
