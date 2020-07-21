package pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String, MyShape> shapes = new HashMap<String, MyShape>();

	public static MyShape getShape(String label) {
		MyShape concreteShape = shapes.get(label);

		if (concreteShape == null) {
			if (label.equals("R")) {
				concreteShape = new MyRectangle();
			} else if (label.equals("O")) {
				concreteShape = new MyOval();
			}
			shapes.put(label, concreteShape);
		}
		return concreteShape;
	}
}
