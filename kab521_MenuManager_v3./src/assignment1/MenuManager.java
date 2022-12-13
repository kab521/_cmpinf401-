package assignment1;
import java.util.ArrayList;
import java.util.Random;

public class MenuManager {
	private ArrayList<Entree> entrees;
	private ArrayList<Side> sides;
	private ArrayList<Salad> salads;
	private ArrayList<Dessert> desserts;

	public MenuManager(String dishesFile) {
		ArrayList<MenuItem> items = FileManager.readItems(dishesFile);
		entrees = new ArrayList<Entree>();
		sides = new ArrayList<Side>();
		salads = new ArrayList<Salad>();
		desserts = new ArrayList<Dessert>();
		for (MenuItem item : items) {
			if (item.getClass() == Entree.class) {
				this.entrees.add((Entree) item);
			}
			if (item.getClass() == Side.class) {
				this.sides.add((Side) item);
			}
			if (item.getClass() == Salad.class) {
				this.salads.add((Salad) item);
			}
			if (item.getClass() == Dessert.class) {
				this.desserts.add((Dessert) item);
			}
		}
	}

	/**
	 * Method randomMenu
	 * 
	 * @return a Menu object consisting of a set of random entree, side, salad and
	 *         desserts from the files.
	 */
	public Menu1 randomMenu(String name) {
		Random r = new Random();
		Menu1 menu = new Menu1(name, entrees.get(r.nextInt(0, this.entrees.size())),
				sides.get(r.nextInt(0, this.sides.size())), salads.get(r.nextInt(0, this.salads.size())),
				desserts.get(r.nextInt(0, this.desserts.size())));
		return menu;
	}

	public Menu1 minCaloriesMenu(String name) {
		Entree minCalEntree = entrees.get(0);
		Side minCalSide = sides.get(0);
		Salad minCalSalad = salads.get(0);
		Dessert minCalDessert = desserts.get(0);
		for (Entree entree : entrees) {
			minCalEntree = entree.getCalories() < minCalEntree.getCalories() ? entree : minCalEntree;
		}
		for (Side side : sides) {
			minCalSide = side.getCalories() < minCalSide.getCalories() ? side : minCalSide;
		}
		for (Salad salad : salads) {
			minCalSalad = salad.getCalories() < minCalSalad.getCalories() ? salad : minCalSalad;
		}
		for (Dessert dessert : desserts) {
			minCalDessert = dessert.getCalories() < minCalDessert.getCalories() ? dessert : minCalDessert;
		}
		Menu1 menu = new Menu1(name, minCalEntree, minCalSide, minCalSalad, minCalDessert);
		return menu;
	}

	public Menu1 maxCaloriesMenu(String name) {
		Entree maxCalEntree = entrees.get(0);
		Side maxCalSide = sides.get(0);
		Salad maxCalSalad = salads.get(0);
		Dessert maxCalDessert = desserts.get(0);
		for (Entree entree : entrees) {
			maxCalEntree = entree.getCalories() > maxCalEntree.getCalories() ? entree : maxCalEntree;
		}
		for (Side side : sides) {
			maxCalSide = side.getCalories() > maxCalSide.getCalories() ? side : maxCalSide;
		}
		for (Salad salad : salads) {
			maxCalSalad = salad.getCalories() > maxCalSalad.getCalories() ? salad : maxCalSalad;
		}
		for (Dessert dessert : desserts) {
			maxCalDessert = dessert.getCalories() > maxCalDessert.getCalories() ? dessert : maxCalDessert;
		}
		Menu1 menu = new Menu1(name, maxCalEntree, maxCalSide, maxCalSalad, maxCalDessert);
		return menu;
	}

	/**
	 * @return the entrees
	 */
	public ArrayList<Entree> getEntrees() {
		return entrees;
	}

	/**
	 * @param entrees the entrees to set
	 */
	public void setEntrees(ArrayList<Entree> entrees) {
		this.entrees = entrees;
	}

	/**
	 * @return the sides
	 */
	public ArrayList<Side> getSides() {
		return sides;
	}

	/**
	 * @param sides the sides to set
	 */
	public void setSides(ArrayList<Side> sides) {
		this.sides = sides;
	}

	/**
	 * @return the salads
	 */
	public ArrayList<Salad> getSalads() {
		return salads;
	}

	/**
	 * @param salads the salads to set
	 */
	public void setSalads(ArrayList<Salad> salads) {
		this.salads = salads;
	}

	/**
	 * @return the desserts
	 */
	public ArrayList<Dessert> getDesserts() {
		return desserts;
	}

	/**
	 * @param desserts the desserts to set
	 */
	public void setDesserts(ArrayList<Dessert> desserts) {
		this.desserts = desserts;
	}

}