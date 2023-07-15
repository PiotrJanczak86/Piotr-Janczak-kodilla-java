package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TasksQueueTestSuite {
    @Test
    public void testUpdate() {
        //Given
        Trainee trainee1 = new Trainee("Piotr Jańczak");
        Trainee trainee2 = new Trainee("Jan Kowalski");
        Trainee trainee3 = new Trainee("Adam Nowak");
        TasksQueue trainee1Tasks = new TasksQueue(trainee1);
        TasksQueue trainee2Tasks = new TasksQueue(trainee2);
        TasksQueue trainee3Tasks = new TasksQueue(trainee3);
        Mentor mentor1 = new Mentor("Andrzej Jaromin");
        Mentor mentor2 = new Mentor("Szymon Gąsienica-Kotelnicki");
        trainee1Tasks.registerObserver(mentor2);
        trainee2Tasks.registerObserver(mentor1);
        trainee3Tasks.registerObserver(mentor1);
        //When
        trainee1Tasks.addTask(new Task("task 1"));
        trainee1Tasks.addTask(new Task("task 2"));
        trainee2Tasks.addTask(new Task("task 1"));
        trainee3Tasks.addTask(new Task("task 1"));
        trainee3Tasks.addTask(new Task("task 2"));
        //Then
        assertEquals(3, mentor1.getTasksCount());
        assertEquals(2, mentor2.getTasksCount());
    }
}