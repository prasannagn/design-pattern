package pattern.strategy.client;

import pattern.strategy.impl.FlyNoWay;
import pattern.strategy.impl.Quack;

public class RubberDuck extends Duck {

	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am RubberDuck");
	}

}
