package statePattern2;

public class TVSleepState implements State{
	
	@Override
	public void doAction() {
		System.out.println("TV was put into SLEEP");
	}
}
