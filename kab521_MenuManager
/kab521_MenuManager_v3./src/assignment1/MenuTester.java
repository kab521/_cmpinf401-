package assignment1;

import java.util.ArrayList;

public class MenuTester {

	public static void main(String[] args) throws Exception {
		MenuManager manager = new MenuManager("data/dishes.txt");
		ArrayList<Menu1> menus = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			Menu1 myMenu = manager.randomMenu("Random Menu No. " + i);
			System.out.println(myMenu.toString() + myMenu.description() + "Total calories: " + myMenu.totalCalories()
					+ "\nTotal price: " + myMenu.totalPrice());
			menus.add(myMenu);
		}
		Menu1 minCalMenu = manager.minCaloriesMenu("Menu with Minimum Calories");
		Menu1 maxCalMenu = manager.maxCaloriesMenu("Menu with Maximum Calories");
		System.out.println(minCalMenu.toString() + minCalMenu.description() + "Total calories: "
				+ minCalMenu.totalCalories() + "\nTotal price: " + minCalMenu.totalPrice());
		System.out.println(maxCalMenu.toString() + maxCalMenu.description() + "Total calories: "
				+ maxCalMenu.totalCalories() + "\nTotal price: " + maxCalMenu.totalPrice());
		menus.add(minCalMenu);
		menus.add(maxCalMenu);
		FileManager.writeMenu("data/menus.txt", menus);
	}

}