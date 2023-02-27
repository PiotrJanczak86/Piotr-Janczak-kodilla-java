package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("get groceries");
        board.getInProgressList().getTasks().add("clean kitchen");
        board.getDoneList().getTasks().add("meditate");
        String toDoTask = board.getToDoList().getTasks().get(0);
        String inProgressTask = board.getInProgressList().getTasks().get(0);
        String doneTask = board.getDoneList().getTasks().get(0);
        //Then
        assertEquals("get groceries", toDoTask);
        assertEquals("clean kitchen", inProgressTask);
        assertEquals("meditate", doneTask);
    }
}