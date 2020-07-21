package pattern.strategy;

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

interface FlyBehavior {
	void fly();
}

interface QuackBehavior {
	void quack();
}

class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Can't fly");
	}

}

class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Flying with wings");
	}

}

class MuteQuack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Can't Quack");
	}

}

class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack");
	}

}

class Squeak implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Squeak");
	}

}

class DecoyDuck extends Duck {

	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}

	public void display() {
		System.out.println("I am DecoyDuck");
	}

}

abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;

	public void swim() {
		System.out.println("All ducks swim");
	}

	public abstract void display();

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

}

class MallardDuck extends
		Duck {

	public MallardDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am MallardDuck");
	}

}

class ReadHeadDuck extends
		Duck {

	public ReadHeadDuck() {
		setFlyBehavior(new FlyWithWings());
		setQuackBehavior(new Squeak());
	}

	public void display() {
		System.out.println("I am ReadHeadDuck");
	}

}

class RubberDuck extends
		Duck {

	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Quack());
	}

	public void display() {
		System.out.println("I am RubberDuck");
	}

}
