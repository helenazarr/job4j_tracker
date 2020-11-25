package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StartUI {
    public static void main(String[] args) {
        Item item = new Item(1, "A1");
        /*Tracker tracker = new Tracker();
        tracker.add(item);
        Item tmpItem = tracker.findById(1);
        System.out.println(tmpItem.getId() + " - " + tmpItem.getName());*/
        System.out.println(item.toString());
    }
}
