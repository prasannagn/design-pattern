package pattern.adapter;

public class Main {
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck();
		Turkey turkey = new WildTurkey();
		TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);

		test(mallardDuck);
		test(turkeyAdapter);

	}

	private static void test(Duck duck) {
		duck.quack();
		duck.fly();

	}
}
