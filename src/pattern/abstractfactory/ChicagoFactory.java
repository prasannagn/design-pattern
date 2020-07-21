package pattern.abstractfactory;

public class ChicagoFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if ("cheese".equals(type)) {
			pizza = new ChicagoCheasePizza();
		} else if ("pepperoni".equals(type)) {
			pizza = new ChicagoPepperoni();
		} else if ("veggie".equals(type)) {
			pizza = new ChicagoVeggie();
		}
		return pizza;
	}
}
