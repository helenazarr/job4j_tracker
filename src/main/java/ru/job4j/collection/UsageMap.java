package ru.job4j.collection;
import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        students.put("elz@gmail.com", "Elena Zarubina");
        for (String key : students.keySet()) {
            String value = students.get(key);
            System.out.println(key + " = " + value);
        }
    }
}