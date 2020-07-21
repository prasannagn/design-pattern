package pattern.state;

public class Main {
	public static void main(String[] args) {

		GumBallMachine gumBallMachine = new GumBallMachine(2);

		gumBallMachine.insertQuarter();
		gumBallMachine.ejectQuarter();		
		gumBallMachine.turnCrank();
		System.out.println("---------------------");
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.turnCrank();
		gumBallMachine.dispence();
		System.out.println("---------------------");
		gumBallMachine.insertQuarter();
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.dispence();
		System.out.println("---------------------");
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.dispence();
		System.out.println("---------------------");
		gumBallMachine.setCount(1);
		gumBallMachine.insertQuarter();
		gumBallMachine.turnCrank();
		gumBallMachine.dispence();
	}
}
