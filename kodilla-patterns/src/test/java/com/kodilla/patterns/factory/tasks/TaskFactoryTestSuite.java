package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryDriving(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        assertEquals("drive", driving.getTaskName());
        assertTrue(driving.isTaskExecuted());
    }
    @Test
    void testFactoryPainting(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        assertEquals("paint", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }
    @Test
    void testFactoryShopping(){
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING);
        shopping.executeTask();
        //Then
        assertEquals("grocery shopping", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }
}
