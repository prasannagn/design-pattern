package pattern.state;

public class HasQuarterState implements State {

	private GumBallMachine gumBallMachine;

	public HasQuarterState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can not insert another quarter");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Quarter returned");
		gumBallMachine.setState(gumBallMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		System.out.println("Crank turned");
		gumBallMachine.setState(gumBallMachine.getSoldState());
	}

	@Override
	public void dispence() {
		System.out.println("No gumball dispensed");

	}

}
