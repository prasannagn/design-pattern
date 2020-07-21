package pattern.template;

public abstract class Beverage {

	public final void prepareBeverage() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	public abstract void brew();

	public abstract void addCondiments();

	public void pourInCup() {
		System.out.println("Pouring into cup");
	}

	public void boilWater() {
		System.out.println("Boiling water");
	}
}
