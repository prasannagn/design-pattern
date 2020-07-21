package pattern.state;

public class GumBallMachine {
	private State noQuarterState;
	private State soldOutState;
	private State hasQuarterState;
	private State soldState;
	private State state = soldOutState;
	private int count;

	public GumBallMachine(int noOfGumBalls) {
		count = noOfGumBalls;
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState();
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		if (count > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();

	}

	public void dispence() {
		state.dispence();
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;

	}

	public void release() {
		System.out.println("Gumball comes rolling out");
		if (count > 0) {
			count--;
		}
	}

	public void setCount(int count) {
		this.count = count;
		if (count > 0) {
			state = noQuarterState;
		}
	}

}
