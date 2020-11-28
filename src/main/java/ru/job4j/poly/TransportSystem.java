package ru.job4j.poly;

public class TransportSystem {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Bus bus = new Bus();
        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for (Vehicle vh : vehicles) {
            vh.move();
        }
    }
}
