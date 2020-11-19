package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже...");
        } else if (position == 2) {
            System.out.println("Спокойной ночи...");
        } else {
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox childhood = new Jukebox();
        childhood.music(1);
        childhood.music(2);
        childhood.music(8);
    }
}
