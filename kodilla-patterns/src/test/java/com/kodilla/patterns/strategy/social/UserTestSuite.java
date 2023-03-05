package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User peter = new Millenials("Peter Green");
        User john = new YGeneration("John Yellow");
        User tom = new ZGeneration("Tom Black");
        //When
        String peterSharesOn = peter.sharePost();
        String johnSharesOn = john.sharePost();
        String tomSharesOn = tom.sharePost();
        //Then
        assertEquals("User shares something on Facebook", peterSharesOn);
        assertEquals("User shares something on Twitter", johnSharesOn);
        assertEquals("User shares something on Snapchat", tomSharesOn);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User peter = new Millenials("Peter Green");
        //When
        String peterSharesOn = peter.sharePost();
        peter.setSocialPublisher(new TwitterPublisher());
        peterSharesOn = peter.sharePost();
        //Then
        assertEquals("User shares something on Twitter", peterSharesOn);
    }
}
