package pattern.strategy.client;

import pattern.strategy.impl.FlyWithWings;
import pattern.strategy.impl.Squeak;

public class ReadHeadDuck extends Duck {

	public ReadHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Squeak());
	}

	public void display() {
		System.out.println("I am ReadHeadDuck");
	}

}
