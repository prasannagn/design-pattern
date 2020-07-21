package pattern.decorator;

public class Main {
	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		System.out.println(beverage.getDescription() + "\t\tCost:" + beverage.cost());
		beverage = new Moca(beverage);
		System.out.println(beverage.getDescription() + "\t\tCost:" + beverage.cost());
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + "\t\tCost:" + beverage.cost());

		beverage = new HouseBlend();
		System.out.println(beverage.getDescription() + "\t\tCost:" + beverage.cost());
		beverage = new Milk(beverage);
		System.out.println(beverage.getDescription() + "\t\tCost:" + beverage.cost());

	}
}
