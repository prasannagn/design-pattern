package pattern.strategy.client;

import pattern.strategy.impl.FlyWithWings;
import pattern.strategy.impl.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am MallardDuck");
	}

}
