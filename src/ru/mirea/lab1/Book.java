package ru.mirea.lab1;

public class Book {
    private String title, author;
    int year;

    public Book(){
        this.title = "1984";
        this.author = "George Orwell";
        this.year = 1948;
    }

    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void turnPage(){
        System.out.println("Page turnt");
    }

    public void set_title(String title){
        this.title = title;
    }

    public String get_title(){
        return title;
    }

    public void set_author(String author){
        this.title = author;
    }

    public String get_author(){
        return author;
    }

    public void set_year(int year){
        this.year = year;
    }

    public int get_year(){
        return year;
    }

    @Override
    public String toString(){
        return "This book title is " + title + ", it had written by " + author + " and published in " + year;
    }

}
