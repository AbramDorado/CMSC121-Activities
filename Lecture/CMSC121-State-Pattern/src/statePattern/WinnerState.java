package statePattern;
public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    public void insertQuarter() {
        System.out.println("error, you just won");
    }
    public void ejectQuarter() {
        System.out.println("error, you just won");

    }
    public void turnCrank() {
        System.out.println("error, you just won");
    }
    // instance variables and constructor
    // insertQuarter error message
    // ejectQuarter error message
    // turnCrank error message
    public void dispense() {
        System.out.println("YOU’RE A WINNER !You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs !");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}

