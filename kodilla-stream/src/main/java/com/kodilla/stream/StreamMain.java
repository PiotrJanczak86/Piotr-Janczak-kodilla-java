package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.mirror.Mirror;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {


        Forum theForum = new Forum();
        Map<Integer, ForumUser> filteredMapOfUsers = theForum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> (LocalDate.now().minusYears(20).isAfter(user.getBirthDate())))
                .filter(user -> user.getNoOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getID, ForumUser -> ForumUser));

        filteredMapOfUsers.entrySet().stream()
            .map(entry -> entry.getKey() + ": " + entry.getValue())
            .forEach(System.out::println);
        
        Mirror.mirroring("Adam");
        
    }

}