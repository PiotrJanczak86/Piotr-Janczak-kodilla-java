package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int iD;
    private final String name;
    private final char sex;
    private final LocalDate birthDate;
    private final int NoOfPosts;

    public ForumUser(int iD, String name, char sex, LocalDate birthDate, int noOfPosts) {
        this.iD = iD;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        NoOfPosts = noOfPosts;
    }

    public int getID() {
        return iD;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNoOfPosts() {
        return NoOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "iD=" + iD +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", NoOfPosts=" + NoOfPosts +
                '}';
    }
}
