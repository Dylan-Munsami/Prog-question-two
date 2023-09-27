/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1question2;

/**
 *
 * @author lab_services_student
 */

public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int year, String genre) {
        super(title, author, year);
        this.genre = genre;
    }


}