/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1question2;

/**
 *
 * @author lab_services_student
 */
public class DVD extends LibraryItem {
    private String director;

    public DVD(String title, String director, int year) {
        super(title, "", year); 
        this.director = director;
    }

   
}

    
