package com.example.myapplication;

import java.util.ArrayList;


public class Form {
    /**Init*/
    public ArrayList<Book> books = new ArrayList<>();

    /**SetterGetter*/
    public ArrayList<Book> getBooks() { return books; }
    public int getSize (){ return books.size(); }

    /**Methods*/
    public void booksAdd(){
        books.add(new Book("Душим кур вместе"));
        books.add(new Book("Сто рецептов из курятины"));
    }
}
