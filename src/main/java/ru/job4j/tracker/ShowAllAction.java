package ru.job4j.tracker;

import java.util.List;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Show all items ====");
        List<Item> inItems = tracker.findAll();
        for (int i = 0; i < inItems.size(); i++) {
            out.println(inItems.get(i).toString());
        }
        return true;
    }
}
