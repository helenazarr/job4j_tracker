package ru.job4j.poly;

public interface Transport {
    void move();
    void seatPassenger(int numberOfPassengers);
    double refuel(double volume);
}
