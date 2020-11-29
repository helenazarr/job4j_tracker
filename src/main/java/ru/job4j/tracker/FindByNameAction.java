package ru.job4j.tracker;

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
        Item[] inItems = tracker.findByName(name);
        if (inItems.length > 0) {
            for (int i = 0; i < inItems.length; i++) {
                out.println(inItems[i].toString());
            }
        } else {
            out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
