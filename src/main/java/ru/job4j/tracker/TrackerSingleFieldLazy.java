package ru.job4j.tracker;

public class TrackerSingleFieldLazy {
    private static TrackerSingleFieldLazy instance;

    private TrackerSingleFieldLazy() {
    }

    public static TrackerSingleFieldLazy getInstance() {
        if (instance == null) {
            instance = new TrackerSingleFieldLazy();
        }
        return instance;
    }

    public Item add(Item model) {
        return model;
    }
}
