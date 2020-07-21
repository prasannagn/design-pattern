package pattern.strategy.impl;

import pattern.strategy.intr.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}

}
