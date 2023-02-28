package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library number 1");
        Book book1 = new Book("Dylan Murphy", "Wolf of the mountain", LocalDate.of(2003, 1, 7));
        Book book2 = new Book("Phoebe Pearson", "Slaves of dreams", LocalDate.of(2012, 3, 15));
        Book book3 = new Book("Morgan Walsh", "Obliteration of heaven", LocalDate.of(2001, 6, 4));
        Book book4 = new Book("Aimee Murphy", "Rejecting the night", LocalDate.of(2015, 12, 28));
        Book book5 = new Book("Ryan Talley", "Gangsters and kings", LocalDate.of(2007, 5, 5));
        Book book6 = new Book("Madelyn Carson", "Unity without duty", LocalDate.of(2007, 7, 14));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);


        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(book6);
        //Then
        assertEquals(5, library.getBooks().size());
        assertEquals(5, clonedLibrary.getBooks().size());
        assertEquals(6, deepClonedLibrary.getBooks().size());
        assertEquals(clonedLibrary.getBooks(), library.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}