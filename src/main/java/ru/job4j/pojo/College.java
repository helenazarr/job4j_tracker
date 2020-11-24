package ru.job4j.pojo;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Elena");
        student.setGroupNumber("A53427");
        student.setEntranceDate(new Date());

        System.out.println(student.getName() + " entered the university in " + student.getEntranceDate() + ". She studies in group " + student.getGroupNumber());
    }
}
