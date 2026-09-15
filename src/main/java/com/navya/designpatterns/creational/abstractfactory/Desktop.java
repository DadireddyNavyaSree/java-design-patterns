package com.navya.designpatterns.creational.abstractfactory;

public class Desktop implements Computer {
    @Override
    public void printComputerInfo() {
        System.out.println("This is a desktop computer.");
    }
}
