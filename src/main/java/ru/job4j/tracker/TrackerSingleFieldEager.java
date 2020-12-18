package ru.job4j.tracker;

public class TrackerSingleFieldEager {
    private static final TrackerSingleFieldEager INSTANCE = new TrackerSingleFieldEager();

    private TrackerSingleFieldEager() {
    }

    public static TrackerSingleFieldEager getInstance() {
        return INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }
}
