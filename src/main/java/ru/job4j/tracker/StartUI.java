package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                int id = input.askInt("Enter id: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(id, name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ====");
                Item[] inItems = tracker.findAll();
                for (int i = 1; i < inItems.length; i++) {
                    System.out.println(inItems[i].toString());
                }
            } else if (select == 2) {

            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                int id = input.askInt("Enter id: ");
                System.out.println(tracker.delete(id));
            } else if (select == 4) {
                System.out.println("=== Find item ====");
                int id = input.askInt("Enter id: ");
                Item item = tracker.findById(id);
                System.out.println(item.toString());
            } else if (select == 5) {
                System.out.println("=== Find item ====");
                String name = input.askStr("Enter name: ");
                Item[] inItems = tracker.findByName(name);
                for (int i = 1; i < inItems.length; i++) {
                    System.out.println(inItems[i].toString());
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}