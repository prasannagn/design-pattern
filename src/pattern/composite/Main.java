package pattern.composite;

public class Main {
	public static void main(String[] args) {
		MenuComponent packageHouseMenu = new Menu("PAKAGE HOUSE MENU",
				"breakfast");
		MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
		MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
		MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert");
		MenuComponent mainMenu = new Menu("MENU", "Menu");

		mainMenu.add(packageHouseMenu);
		mainMenu.add(dinerMenu);
		mainMenu.add(cafeMenu);
		mainMenu.add(dessertMenu);

		packageHouseMenu.add(new MenuItem("Idle", "2 Idles", 50, true));
		packageHouseMenu.add(new MenuItem("Idle Vada", "2 Idles, 1 Vada", 100,
				true));
		dinerMenu.add(new MenuItem("Meals", "Meals", 200, true));
		cafeMenu.add(new MenuItem("Curd Rice", "Curd Rice", 50, true));
		dessertMenu.add(new MenuItem("Apple Pie", "Apple Pie", 50, false));

		mainMenu.print();
	}
}
