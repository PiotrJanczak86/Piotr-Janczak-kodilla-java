package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest(){
        //Given
        Set<Book> books = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();
        Book book1 = new Book("Author 1","Title 1", 1978,"5048");
        Book book2 = new Book("Author 2","Title 2", 1999,"23536");
        Book book3 = new Book("Author 3","Title 3", 2005,"634789");
        Book book4 = new Book("Author 4","Title 4", 2007,"12436");
        Book book5 = new Book("Author 5","Title 5", 2012,"123366");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        //When
        int median = medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(2005, median);
    }
}