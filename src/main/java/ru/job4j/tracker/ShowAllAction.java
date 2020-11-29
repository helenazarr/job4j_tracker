package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "=== Show all items ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] inItems = tracker.findAll();
        for (int i = 0; i < inItems.length; i++) {
            System.out.println(inItems[i].toString());
        }
        return true;
    }
}
