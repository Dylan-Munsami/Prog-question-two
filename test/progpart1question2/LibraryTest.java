/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package progpart1question2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
    private Library library;

    @Before
    public void setUp() {
        library = new Library(10);
    }

    @Test
    public void testAddItem() {
        Book book = new Book("Test Book", "Test Author", 2023, "Test Genre");
        library.addItem(book);
        assertTrue(library.containsItem(book));
    }

    @Test
    public void testAddItemToFullLibrary() {
        Library library = new Library(1);
        Book book1 = new Book("Book 1", "Author 1", 2022, "Genre 1");
        Book book2 = new Book("Book 2", "Author 2", 2023, "Genre 2");

        library.addItem(book1);
        library.addItem(book2);

        assertFalse(library.containsItem(book2));
    }
}
