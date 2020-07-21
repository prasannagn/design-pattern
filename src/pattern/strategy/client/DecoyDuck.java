package pattern.strategy.client;

import pattern.strategy.impl.FlyNoWay;
import pattern.strategy.impl.MuteQuack;

public class DecoyDuck extends Duck {

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display() {
		System.out.println("I am DecoyDuck");
	}

}
