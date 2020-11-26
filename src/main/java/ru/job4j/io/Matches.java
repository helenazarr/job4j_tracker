package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Начало игры. Игрок 1 ");
        boolean run = true;
        int allMatches = 11;
        int turn = 0;
        while (run) {
            int inMatches = Integer.valueOf(input.nextLine());
            if (inMatches >= 1 && inMatches <= 3) {
                if (allMatches - inMatches < 0) {
                    System.out.print("Неправильное число спичек. Осталось " + allMatches + " ");
                } else if (allMatches - inMatches == 0) {
                    System.out.print("Конец игры ");
                    run = false;
                } else {
                    allMatches -= inMatches;
                    int player = turn % 2 == 0 ? 2 : 1;
                    System.out.print("Осталось " + allMatches + ". Игрок " + player + " ");
                    turn++;
                }
            } else {
                System.out.print("Неправильное число спичек. Введите еще раз ");
            }
        }
    }
}
