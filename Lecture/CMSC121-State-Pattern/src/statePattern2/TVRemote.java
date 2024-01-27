package statePattern2;

public class TVRemote {
	
	public static void main(String[] args) {
		TVContext context = new TVContext();
		State tvStartState = new TVStartState();
		State tvStopState = new TVStopState();
		State tvSleepState = new TVSleepState();
		
		context.setState(tvStartState);
		context.doAction();
		
		context.setState(tvStopState);
		context.doAction();
		
	
		context.setState(tvSleepState);
		context.doAction();
		}
}
