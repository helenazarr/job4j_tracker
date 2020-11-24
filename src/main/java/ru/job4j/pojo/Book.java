package ru.job4j.pojo;

public class Book {
    private String title;
    private int sizeInPages;

    public Book(String title, int sizeInPages) {
        this.title = title;
        this.sizeInPages = sizeInPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSizeInPages() {
        return sizeInPages;
    }

    public void setSizeInPages(int sizeInPages) {
        this.sizeInPages = sizeInPages;
    }
}
