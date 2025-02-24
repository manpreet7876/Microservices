package com.wipro.microservices.i;

public interface ParkingLot {
    void carPark(Car car);
    void unparkCar(Car car);
    void checkCapacity();
    void payment(Car car) throws Exception;
}
