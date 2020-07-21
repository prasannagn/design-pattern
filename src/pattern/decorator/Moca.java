package pattern.decorator;

public class Moca extends CondimentDecorator{
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
