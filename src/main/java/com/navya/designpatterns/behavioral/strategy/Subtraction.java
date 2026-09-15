package com.navya.designpatterns.behavioral.strategy;

public class Subtraction implements Strategy {
    
    public void execute(int num1 , int num2) {
        
        System.out.println(num1 - num2);
    }
}
