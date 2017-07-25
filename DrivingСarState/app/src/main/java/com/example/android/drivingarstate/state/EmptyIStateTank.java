package com.example.android.drivingarstate.state;

import com.example.android.drivingarstate.Car;

public class EmptyIStateTank implements IStateCar {

    private Car car;

    public EmptyIStateTank(Car car) {
        this.car = car;
    }

    @Override
    public String fullTank() {
        car.setGasoline(50);
        car.setIStateCar(new FullTankIState(car));
        return "Бак заполнен";
    }

    @Override
    public String turnKey() {
        return "Не могу завестись без бензина";
    }

    @Override
    public String driver() {
        return "Я не езжу без бензина";
    }

    @Override
    public String stop() {
        return "Я и так стою, нет бензина!";
    }
}
