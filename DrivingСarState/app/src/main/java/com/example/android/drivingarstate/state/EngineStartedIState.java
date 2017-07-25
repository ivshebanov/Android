package com.example.android.drivingarstate.state;

import com.example.android.drivingarstate.Car;

public class EngineStartedIState implements IStateCar {

    private Car car;

    public EngineStartedIState(Car car) {
        this.car = car;
    }

    @Override
    public String fullTank() {
        return "Сначала заглуши двигатель";
    }

    @Override
    public String turnKey() {
        car.setIStateCar(new FullTankIState(car));
        return "Заглушил";
    }

    @Override
    public String driver() {
        return tryDrive();
    }

    @Override
    public String stop() {
        return "Еще стоим";
    }

    private String tryDrive() {
        if (car.getGasoline() >= 15) {
            car.setGasoline(car.getGasoline() - 10);
            car.setIStateCar(new DrivingIState(car));
            return "Поехали!";
        } else {
            car.setIStateCar(new EmptyIStateTank(car));
            return "Бензин закончился";
        }
    }
}
