package kab521_MenuManager_v3;

import java.util.ArrayList;

public class MenuTester {
	public static void main(String[] args) throws Exception {
		MenuManager manager = new MenuManager("data/dishes.txt");
		ArrayList<Menu> menus = new ArrayList<>();
		for (int i = 1; i <= 8; i++) {
			Menu myMenu = manager.randomMenu("Randomized Menu " + i + "!");
			System.out.println(myMenu.toString() + myMenu.description() + "Total calories: " + myMenu.totalCalories()
					+ "\nTotal price: " + myMenu.totalPrice());
			menus.add(myMenu);
		}
		FileManager.writeMenu("data/menus.txt", menus);
	}
}