package com.example.android.drivingarstate.state;

import com.example.android.drivingarstate.Car;

public class FullTankIState implements IStateCar {

    private Car car;

    public FullTankIState(Car car) {
        this.car = car;
    }

    @Override
    public String fullTank() {
        car.setGasoline(50);
        return "Бак полон";
    }

    @Override
    public String turnKey() {
        car.setIStateCar(new EngineStartedIState(car));
        return "Дрын дрын дрын";
    }

    @Override
    public String driver() {
        return "Вначале надо завестись";
    }

    @Override
    public String stop() {
        return "Мы еще не куда не ездили";
    }
}
