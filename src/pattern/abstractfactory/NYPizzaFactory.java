package pattern.abstractfactory;

public class NYPizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new NYCheasePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new NYPepperoni();
		} else if ("veggie".equals(type)) {
			pizza = new NYVeggie();
		}
		return pizza;
	}
}
