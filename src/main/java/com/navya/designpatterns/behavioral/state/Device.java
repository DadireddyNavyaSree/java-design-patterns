package com.navya.designpatterns.behavioral.state;

public class Device {
    private State state;

    public Device(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void switchOnOff() {
        state.switchOnOff();
    }
}
