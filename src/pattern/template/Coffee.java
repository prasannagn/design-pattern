package pattern.template;

public class Coffee extends Beverage {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding suger and milk");
	}

}
