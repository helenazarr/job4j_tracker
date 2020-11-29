package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] inItems = tracker.findByName(name);
        if (inItems.length > 0) {
            for (int i = 0; i < inItems.length; i++) {
                System.out.println(inItems[i].toString());
            }
        } else {
            System.out.println("Заявки с таким именем не найдены");
        }
        return true;
    }
}
