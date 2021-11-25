package com.hz;

import com.hz.states.GumballMachineState;
import com.hz.states.NoQuarter;
import com.hz.states.SoldOut;

import java.util.Objects;

public class GumballMachine {

    protected GumballMachineState state = new SoldOut();
    int count = 0;

    public GumballMachine(int count) {
        this.count = count;
        if (count > 0) {
            this.state = new NoQuarter();
        }
    }

    public void setState(GumballMachineState state) {
        this.state = state;
    }

    public void refill(int numGumBalls) {
        this.count += numGumBalls;
        if (this.state.getClass().getSimpleName().equals("SoldOut")) {
            this.state = new NoQuarter();
        }
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2004\n");
        result.append("Inventory: ").append(count).append(" gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\nMachine is ");
        switch (this.state.getClass().getSimpleName()) {
            case "SoldOut" -> result.append("sold out");
            case "NoQuarter" -> result.append("waiting for quarter");
            case "HasQuarter" -> result.append("waiting for turn of crank");
            case "Sold" -> result.append("delivering a gumball");
        }
        result.append("\n");
        return result.toString();
    }
}
