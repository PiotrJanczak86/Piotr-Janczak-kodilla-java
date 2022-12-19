package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    private double noOfUsers;
    private double noOfPosts;
    private double noOfComments;
    private double postsPerUser;
    private double commentsPerUser;
    private double commentsPerPost;
    Statistics statistics;

    public CalculateStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics (Statistics statistics){
        noOfUsers = statistics.usersNames().size();
        noOfPosts = statistics.postsCount();
        noOfComments = statistics.commentsCount();

        if (noOfUsers != 0) {
            postsPerUser = noOfPosts / noOfUsers;
            commentsPerUser = noOfComments / noOfUsers;
        } else {
            postsPerUser = 0;
            commentsPerUser = 0;}

        if (noOfPosts != 0) {
            commentsPerPost = noOfComments / noOfPosts;
        } else {
            commentsPerPost = 0;
        }

    }

    public double getNoOfUsers() {
        return noOfUsers;
    }

    public double getNoOfPosts() {
        return noOfPosts;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getNoOfComments() {
        return noOfComments;
    }
}

