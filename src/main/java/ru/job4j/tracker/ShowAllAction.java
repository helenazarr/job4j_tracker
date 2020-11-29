package ru.job4j.tracker;

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
        Item[] inItems = tracker.findAll();
        for (int i = 0; i < inItems.length; i++) {
            out.println(inItems[i].toString());
        }
        return true;
    }
}
