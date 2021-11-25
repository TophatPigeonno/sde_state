package com.hz.states;

import com.hz.GumballMachine;

public class NoQuarter implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine, int count) {
        machine.setState(new HasQuarter());
        System.out.println("You inserted a quarter");
    }

    @Override
    public void ejectQuarter(GumballMachine machine, int count) {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank(GumballMachine machine, int count) {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense(GumballMachine machine, int count) {
        System.out.println("You need to pay first");
    }
}