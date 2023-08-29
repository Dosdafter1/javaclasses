package com.company.classes;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private String genre;
    private int pageCount;
    private int year;

    public Book() {
        this.title=null;
        this.author=null;
        this.genre=null;
        this.publisher=null;
        this.pageCount=0;
        this.year=0;
    }

    public Book(String title, String author, String publisher, String genre) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.genre = genre;
    }

    public Book(String title, String author, String publisher, String genre, int pageCount, int year) {
        this(title,author,publisher,genre);
        this.pageCount = pageCount;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getGenre() {
        return genre;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        return ""+this.title+" "+this.author+" "+this.genre;
    }
}
