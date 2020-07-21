package pattern.template;

public class Main {
	public static void main(String[] args) {
		Beverage tea = new Tea();
		Beverage coffee = new Coffee();
		tea.prepareBeverage();
		coffee.prepareBeverage();
	}
}

abstract class Beverage {

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

class Tea extends Beverage {

	@Override
	public void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding lemon");
	}

}

class Coffee extends Beverage {

	@Override
	public void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("Adding suger and milk");
	}

}
