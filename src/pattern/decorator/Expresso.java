package pattern.decorator;

public class Expresso extends Beverage {

	public Expresso() {
		setDescription("Expresso");
	}

	@Override
	public double cost() {
		return 1;
	}

}
