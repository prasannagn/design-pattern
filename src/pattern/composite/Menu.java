package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

	private List<MenuComponent> menuComponents;
	private String name;
	private String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		menuComponents = new ArrayList<MenuComponent>();
	}

	public void add(MenuComponent menuComponent) {
		menuComponents.add(menuComponent);
	}

	public void remove(MenuComponent menuComponent) {
		menuComponents.remove(menuComponent);
	}

	public void getChild(int i) {
		menuComponents.get(i);
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void print() {
		System.out.println("\n" + name + "--" + description);
		System.out.println("---------------------------------");
		for (MenuComponent mc : menuComponents) {
			mc.print();
		}
	}

}
