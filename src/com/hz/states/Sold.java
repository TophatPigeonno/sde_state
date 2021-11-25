package com.hz.states;

import com.hz.GumballMachine;

public class Sold implements GumballMachineState {

    @Override
    public void insertQuarter(GumballMachine machine, int count) {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter(GumballMachine machine, int count) {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank(GumballMachine machine, int count) {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense(GumballMachine machine, int count) {
        System.out.println("A gumball comes rolling out the slot");
        count = count - 1;
        if (count == 0) {
            System.out.println("Oops, out of gumballs!");
            machine.setState(new SoldOut());
        } else {
            machine.setState(new NoQuarter());
        }
    }
}
