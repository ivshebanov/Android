package com.example.android.drivingarstate.state;

import com.example.android.drivingarstate.Car;

public class DrivingIState implements IStateCar {

    private Car car;

    public DrivingIState(Car car) {
        this.car = car;
    }

    @Override
    public String fullTank() {
        return "Мы же едем";
    }

    @Override
    public String turnKey() {
        return "Нельзя трогать ключь во время езды!!";
    }

    @Override
    public String driver() {
        return tryDrive();
    }

    @Override
    public String stop() {
        car.setIStateCar(new EngineStartedIState(car));
        return "Остановился";
    }

    private String tryDrive() {
        if (car.getGasoline() >= 15) {
            car.setGasoline(car.getGasoline() - 10);
            return "бррр бррр чух чух";
        } else {
            car.setIStateCar(new EmptyIStateTank(car));
            return "Бензин закончился";
        }
    }
}
