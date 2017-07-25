package com.example.android.drivingarstate;

import com.example.android.drivingarstate.state.EmptyIStateTank;
import com.example.android.drivingarstate.state.IStateCar;

public class Car {
    private int gasoline;
    private IStateCar IStateCar;

    public Car() {
        setGasoline(0);
        setIStateCar(new EmptyIStateTank(this));
    }

    public String fullTank() {
        return IStateCar.fullTank();
    }

    public String turnKey() {
        return IStateCar.turnKey();
    }

    public String driver() {
        return IStateCar.driver();
    }

    public String stop() {
        return IStateCar.stop();
    }

    public int getGasoline() {
        return gasoline;
    }

    public void setGasoline(int gasoline) {
        this.gasoline = gasoline;
    }

    public IStateCar getIStateCar() {
        return IStateCar;
    }

    public void setIStateCar(IStateCar IStateCar) {
        this.IStateCar = IStateCar;
    }
}
