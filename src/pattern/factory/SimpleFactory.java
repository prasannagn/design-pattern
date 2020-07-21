package pattern.factory;

public class SimpleFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new CheasePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new Pepperoni();
		} else if ("veggie".equals(type)) {
			pizza = new Veggie();
		}
		return pizza;
	}
}
