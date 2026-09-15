package com.navya.designpatterns.creational.abstractfactory;

public  class DesktopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
