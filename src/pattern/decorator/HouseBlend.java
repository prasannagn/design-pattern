package pattern.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		setDescription("House Blend coffee");
	}

	@Override
	public double cost() {
		return 2;
	}

}
