package com.navya.designpatterns.structural.decorator;

// concrete component

public class PlainPizza implements Pizza{

    public void bake() {
        System.out.println("Baking plain pizza");
    }
}
