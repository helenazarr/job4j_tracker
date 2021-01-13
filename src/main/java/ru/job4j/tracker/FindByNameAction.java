package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ====");
        String name = input.askStr("Enter name: ");
        List<Item> inItems = tracker.findByName(name);
        if (inItems.size() > 0) {
            for (int i = 0; i < inItems.size(); i++) {
                out.println(inItems.get(i).toString());
            }
        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
