package assignment1;

import java.util.ArrayList;
import java.util.Random;

public class MenuRandomize {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) throws Exception {
		entrees = FileManager.readEntrees(entreeFile);
		sides = FileManager.readSides(sideFile);
		salads = FileManager.readSalads(saladFile);
		desserts = FileManager.readDesserts(dessertFile);
	}
	public Menu1 randomMenu() {
		Random r = new Random();
		Menu1 menu = new Menu1("A Random Menu",entrees.get(r.nextInt(0,5)),
				sides.get(r.nextInt(0,5)),salads.get(r.nextInt(0,5)),desserts.get(r.nextInt(0,5)));
		return menu;
	}
}