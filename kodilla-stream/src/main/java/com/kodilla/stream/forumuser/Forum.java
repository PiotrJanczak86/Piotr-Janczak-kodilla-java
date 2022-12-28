package com.kodilla.stream.forumuser;

import com.kodilla.stream.book.Book;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theForumUsersList = new ArrayList<>();

    public Forum(){

        theForumUsersList.add(new ForumUser(1,"Peter Green", 'M', LocalDate.of(1986, 12, 11),43));
        theForumUsersList.add(new ForumUser(2,"Tom Blue", 'M', LocalDate.of(2002, 7, 5),0));
        theForumUsersList.add(new ForumUser(3,"Marry Black", 'F', LocalDate.of(1999, 1, 25),1));
        theForumUsersList.add(new ForumUser(4,"Bridget Purple", 'F', LocalDate.of(1998, 1, 25),5));
        theForumUsersList.add(new ForumUser(5,"Mike Yellow", 'M', LocalDate.of(2005, 3, 13),10));
        theForumUsersList.add(new ForumUser(6,"Adam White", 'M', LocalDate.of(2002, 3, 13),37));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theForumUsersList);
    }
}
