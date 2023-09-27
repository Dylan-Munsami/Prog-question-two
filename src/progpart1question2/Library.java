/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progpart1question2;

/**
 *
 * @author lab_services_student
 */
public class Library {
    private LibraryItem[] items;
    private int itemCount;

    public Library(int maxItems) {
        items = new LibraryItem[maxItems];
        itemCount = 0;
    }

    public void addItem(LibraryItem item) {
        if (itemCount < items.length) {
            items[itemCount++] = item;
        } else {
            System.out.println("Library is full. Cannot add more items.");
        }
    }

    public boolean containsItem(LibraryItem item) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    
    public void listItems() {
        System.out.println("Library Items:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].toString());
        }
    }
}

    
