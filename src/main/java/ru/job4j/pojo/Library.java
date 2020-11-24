package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Core Java", 2000);
        Book book2 = new Book("Effective Java", 800);
        Book book3 = new Book("Head First", 500);
        Book book4 = new Book("Clean code", 1000);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getSizeInPages() + " pages");
        }
        System.out.println();
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            System.out.println(bk.getTitle() + " - " + bk.getSizeInPages() + " pages");
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            Book bk = books[index];
            if (bk.getTitle() == "Clean code") {
                System.out.println(bk.getTitle() + " - " + bk.getSizeInPages() + " pages");
            }
        }
    }
}
