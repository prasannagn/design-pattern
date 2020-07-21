package pattern.strategy.impl;

import pattern.strategy.intr.FlyBehavior;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}
