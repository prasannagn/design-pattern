package pattern.state;

public class SoldState implements State {

	private GumBallMachine gumBallMachine;

	public SoldState(GumBallMachine gumBallMachine) {
		this.gumBallMachine = gumBallMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("Please wait we already giving you a gum ball");

	}

	@Override
	public void ejectQuarter() {
		System.out.println("Sorry you have already turn the crank");
	}

	@Override
	public void turnCrank() {
		System.out.println("Turnnig crank twice doesnt get you another gumball");
		
	}

	@Override
	public void dispence() {
		gumBallMachine.release();
		if(gumBallMachine.getCount() > 0 ){
			gumBallMachine.setState(gumBallMachine.getNoQuarterState());
		}else{
			gumBallMachine.setState(gumBallMachine.getSoldOutState());
		}
		
	}

}
