/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1question2;

/**
 *
 * @author lab_services_student
 */
public class LibraryItem {
    private String title;
    private String author;
    private int year;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    
    @Override
public String toString() {return "Title: " + title +
       ", Author/Director: " + author +
       ", Year: " + year;
  
}
}

