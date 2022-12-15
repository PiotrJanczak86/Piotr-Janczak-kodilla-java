package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Tests for squares")
    class SquaresTests {
        @DisplayName("checking list size after adding first figure")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();

            //When
            collector.addFigure(new Square(1));

            //Then
            Assertions.assertEquals(1, collector.getSize());
        }

        @DisplayName("checking if it's possible to remove given figure from the list")
        @Test
        void testRemoveNotExistingFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(1));

            //When
            boolean result = collector.removeFigure(new Square(1));

            //Then
            Assertions.assertTrue(result);
        }

        @DisplayName("checking if collecting a figure using list index works as intended")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(1));

            //When
            Shape testSquare;
            testSquare = collector.getFigure(0);

            //Then
            Assertions.assertEquals(new Square(1), testSquare);
        }

        @DisplayName("checking if it's possible to collect figure from negative index")
        @Test
        void testGetFigureOfNegativeIndex() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(1));

            //When
            Shape testSquare;
            testSquare = collector.getFigure(-1);

            //Then
            Assertions.assertNull(testSquare);
        }

        @DisplayName("checking if it's possible to collect figure from index that is too high")
        @Test
        void testGetFigureHighIndex() {

            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(1));

            //When
            Shape testSquare;
            testSquare = collector.getFigure(5);

            //Then
            Assertions.assertNull(testSquare);
        }

        @DisplayName("checking if displaying a figure name works as intended")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            collector.addFigure(new Square(1));
            collector.addFigure(new Circle(1));
            collector.addFigure(new Triangle(3));

            //When
            String tempList = collector.showFigures();

            //Then
            Assertions.assertEquals("Square Circle Triangle ", tempList);
        }
    }
}
