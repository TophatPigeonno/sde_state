package com.hz.states;

import com.hz.GumballMachine;

public interface GumballMachineState {

    void insertQuarter(GumballMachine machine, int count);

    void ejectQuarter(GumballMachine machine, int count);

    void turnCrank(GumballMachine machine, int count);

    void dispense(GumballMachine machine, int count);

}
