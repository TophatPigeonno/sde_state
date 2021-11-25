package com.hz.states;

import com.hz.GumballMachine;

public class HasQuarter implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine, int count) {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter(GumballMachine machine, int count) {
            System.out.println("Quarter returned");
            machine.setState(new NoQuarter());
    }

    @Override
    public void turnCrank(GumballMachine machine, int count) {
        System.out.println("You turned the crank");
        machine.setState(new Sold());
    }

    @Override
    public void dispense(GumballMachine machine, int count) {
            System.out.println("No gumball dispensed, you need to turn the crank first");
    }
}