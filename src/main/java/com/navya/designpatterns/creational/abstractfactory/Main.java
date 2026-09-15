package com.navya.designpatterns.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {

            ComputerFactory factory = new DesktopFactory();
            Computer computer = factory.createComputer();
            computer.printComputerInfo();

            factory = new LaptopFactory();
            computer = factory.createComputer();
            computer.printComputerInfo();
        }
    }

