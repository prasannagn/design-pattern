package pattern.strategy.impl;

import pattern.strategy.intr.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Can't Quack");
	}

}
