package ru.job4j.tracker;

public class TrackerSingleton {
    public static void main(String[] args) {
        TrackerSingleEnumEager tracker1 = TrackerSingleEnumEager.INSTANCE;
        TrackerSingleFieldLazy tracker2 = TrackerSingleFieldLazy.getInstance();
        TrackerSingleFieldEager tracker3 = TrackerSingleFieldEager.getInstance();
        TrackerSingleClassLazy tracker4 = TrackerSingleClassLazy.getInstance();
    }
}
