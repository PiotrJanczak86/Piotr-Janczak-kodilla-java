package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {

    @Mock
    private Statistics StatisticsMock;

    private List<String> generateListOfUsers(int Users) {
        List<String> listOfUsers = new ArrayList<>();

        for (int i = 0 ; i < Users ; i++) {
            listOfUsers.add("User" + i);
        }
        return listOfUsers;
    }


    @Test
    void test0Posts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 0;
        List<String> listOfUsers = generateListOfUsers(5);
        int noOfComments = 50;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(0, calculateStatistics.getNoOfPosts());
        assertEquals(0, calculateStatistics.getPostsPerUser());
        assertEquals(0, calculateStatistics.getCommentsPerPost());
    }

    @Test
    void test1000Posts() {
     // Given
     CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
     int noOfPosts = 1000;
     List<String> listOfUsers = generateListOfUsers(5);
     int noOfComments = 200;

     when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
     when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
     when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

     // When
     calculateStatistics.calculateAdvStatistics(StatisticsMock);


     // Then
     assertEquals(1000, calculateStatistics.getNoOfPosts());
     assertEquals(200.0, calculateStatistics.getPostsPerUser());
     assertEquals(0.2, calculateStatistics.getCommentsPerPost());
     }

    @Test
    void test0Comments() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 100;
        List<String> listOfUsers = generateListOfUsers(5);
        int noOfComments = 0;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(0.0, calculateStatistics.getNoOfComments());
        assertEquals(0.0, calculateStatistics.getCommentsPerUser());
        assertEquals(0.0, calculateStatistics.getCommentsPerPost());
    }

    @Test
    void testLessCommentsThanPosts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 100;
        List<String> listOfUsers = generateListOfUsers(5);
        int noOfComments = 25;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(25, calculateStatistics.getNoOfComments());
        assertEquals(5, calculateStatistics.getCommentsPerUser());
        assertEquals(0.25, calculateStatistics.getCommentsPerPost());
    }
    @Test
    void testMoreCommentsThanPosts() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 10;
        List<String> listOfUsers = generateListOfUsers(5);
        int noOfComments = 25;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(25, calculateStatistics.getNoOfComments());
        assertEquals(5, calculateStatistics.getCommentsPerUser());
        assertEquals(2.5, calculateStatistics.getCommentsPerPost());
    }

    @Test
    void test0Users() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 10;
        List<String> listOfUsers = generateListOfUsers(0);
        int noOfComments = 25;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(0, calculateStatistics.getNoOfUsers());
        assertEquals(0, calculateStatistics.getPostsPerUser());
        assertEquals(0, calculateStatistics.getCommentsPerUser());
    }

    @Test
    void test100Users() {
        // Given
        CalculateStatistics calculateStatistics = new CalculateStatistics(StatisticsMock);
        int noOfPosts = 10;
        List<String> listOfUsers = generateListOfUsers(100);
        int noOfComments = 25;

        when(StatisticsMock.postsCount()).thenReturn(noOfPosts);
        when(StatisticsMock.commentsCount()).thenReturn(noOfComments);
        when(StatisticsMock.usersNames()).thenReturn(listOfUsers);

        // When
        calculateStatistics.calculateAdvStatistics(StatisticsMock);


        // Then
        assertEquals(100, calculateStatistics.getNoOfUsers());
        assertEquals(0.1, calculateStatistics.getPostsPerUser());
        assertEquals(0.25, calculateStatistics.getCommentsPerUser());
    }

}
