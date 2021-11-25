package com.hz;

public class GumballMachineTestDrive {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);

        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);

        System.out.println(gumballMachine);

        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.ejectQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);

        System.out.println(gumballMachine);

        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);
        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);
        gumballMachine.state.ejectQuarter(gumballMachine, gumballMachine.count);

        System.out.println(gumballMachine);

        gumballMachine.refill(2);

        System.out.println(gumballMachine);

        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);
        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);
        gumballMachine.state.insertQuarter(gumballMachine, gumballMachine.count);
        gumballMachine.state.turnCrank(gumballMachine, gumballMachine.count);

        System.out.println(gumballMachine);
    }
}
