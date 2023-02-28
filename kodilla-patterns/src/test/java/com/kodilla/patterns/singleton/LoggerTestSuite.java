package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        logger.log("Example log");
        String lastLog = logger.getLastLog();
        //Then
        assertEquals("Example log", lastLog);
    }
}
