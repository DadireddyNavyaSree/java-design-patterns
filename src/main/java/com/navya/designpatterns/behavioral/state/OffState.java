package com.navya.designpatterns.behavioral.state;

public class OffState implements State{
    public void switchOnOff() {
        System.out.println("Turning ON the device");
    }
}
