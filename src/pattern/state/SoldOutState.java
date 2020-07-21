package pattern.state;

public class SoldOutState implements State {

	public SoldOutState() {

	}

	@Override
	public void insertQuarter() {
		System.out.println("Sorry Sold out");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry Sold out");
	}

	@Override
	public void turnCrank() {
		System.out.println("Sorry Sold out");

	}

	@Override
	public void dispence() {
		System.out.println("Sorry Sold out");

	}

}
