package com.navya.designpatterns.creational.abstractfactory;

public  class LaptopFactory implements ComputerFactory {
    @Override
    public Computer createComputer() {
        return new Laptop();
    }
}
