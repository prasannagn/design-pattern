package pattern.strategy.test;

import pattern.strategy.client.DecoyDuck;
import pattern.strategy.client.Duck;
import pattern.strategy.client.MallardDuck;
import pattern.strategy.client.ReadHeadDuck;
import pattern.strategy.client.RubberDuck;

public class Main {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		Duck readHead = new ReadHeadDuck();
		Duck rubber = new RubberDuck();
		Duck decoy = new DecoyDuck();

		Duck[] ducks = { mallard, readHead, rubber, decoy };

		for (Duck duck : ducks) {
			duck.display();
			duck.performFly();
			duck.performQuack();
			duck.swim();
			System.out.println("----------------------------");
		}
	}
}
