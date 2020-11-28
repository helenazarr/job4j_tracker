package ru.job4j.poly;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " едет по дороге");
    }
/*
    @Override
    public void seatPassenger(int numberOfPassengers) {

    }

    @Override
    public double refuel(double volume) {
        return 0;
    }*/
}
