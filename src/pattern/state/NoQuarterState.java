package pattern.state;

public class NoQuarterState implements State {

	private GumBallMachine gumBallMachine;

	public NoQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You have inserted quarter");
		gumBallMachine.setState(gumBallMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You havent inserted quarter");

	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but no quarter");

	}

	@Override
	public void dispence() {
		System.out.println("You need to pay first");

	}

}
