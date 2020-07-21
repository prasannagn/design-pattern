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

abstract class Beverage {
	private String description = "Unknown Beverage";

	public abstract double cost();

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

abstract class CondimentDecorator extends Beverage {

	public abstract String getDescription();
}

class Expresso extends Beverage {

	public Expresso() {
		setDescription("Expresso");
	}

	@Override
	public double cost() {
		return 1;
	}

}

class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("House Blend coffee");
	}

	@Override
	public double cost() {
		return 2;
	}

}

class Milk extends CondimentDecorator {

	private Beverage beverage;

	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.25;
	}

}

class Moca extends CondimentDecorator{
	private Beverage beverage;

	public Moca(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Moca";
	}

	public double cost() {
		return beverage.cost() + 0.5;
	}

}

