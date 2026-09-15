package com.navya.designpatterns.structural.adapter.object;

// An object adapter , using composition to translate interface

import com.navya.designpatterns.structural.adapter.Customer;
import com.navya.designpatterns.structural.adapter.Employee;
import com.navya.designpatterns.structural.adapter.EmployeeClassAdapter;

public class EmployeeObjectAdapter implements Customer {

    private Employee adaptee;

    public EmployeeObjectAdapter(Employee adaptee) {

        this.adaptee = adaptee;
    }

    @Override
    public String getName() {
        return adaptee.getFullName();
    }

    @Override
    public String getDesignation() {
        return adaptee.getJobTitle();
    }

    @Override
    public String getAddress() {
        return adaptee.getOfficeLocation();
    }
}
