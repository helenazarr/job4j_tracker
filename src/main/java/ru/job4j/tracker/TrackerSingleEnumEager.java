package ru.job4j.tracker;

public enum TrackerSingleEnumEager {
    INSTANCE;
    public Item add(Item model) {
        return model;
    }
}
