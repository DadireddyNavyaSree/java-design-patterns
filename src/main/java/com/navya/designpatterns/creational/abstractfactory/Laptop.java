package com.navya.designpatterns.creational.abstractfactory;


    public class Laptop implements Computer {
        @Override
        public void printComputerInfo() {
            System.out.println("This is a laptop computer.");
        }
    }
