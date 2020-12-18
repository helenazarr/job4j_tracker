package ru.job4j.tracker;

public class TrackerSingleClassLazy {
    private TrackerSingleClassLazy() {
    }

    public static TrackerSingleClassLazy getInstance() {
        return Holder.INSTANCE;
    }

    public Item add(Item model) {
        return model;
    }

    private static final class Holder {
        private static final TrackerSingleClassLazy INSTANCE = new TrackerSingleClassLazy();
    }
}
