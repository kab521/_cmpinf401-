package kab521_MenuManager_v3;

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
				this.entrees.add((Entree) item); }
			if (item.getClass() == Side.class) {
				this.sides.add((Side) item); }
			if (item.getClass() == Salad.class) {
				this.salads.add((Salad) item); }
			if (item.getClass() == Dessert.class) {
				this.desserts.add((Dessert) item);
		}
	}
}

public Menu randomMenu(String name) {
	Random r = new Random();
	Menu menu = new Menu(name, entrees.get(r.nextInt(0, this.entrees.size())),
	sides.get(r.nextInt(0, this.sides.size())), salads.get(r.nextInt(0, this.salads.size())),
	desserts.get(r.nextInt(0, this.desserts.size())));
	return menu; }
public ArrayList<Entree> getEntrees() {
	return entrees; }
public void setEntrees(ArrayList<Entree> entrees) {
	this.entrees = entrees; }
public ArrayList<Side> getSides() {
	return sides; }
public void setSides(ArrayList<Side> sides) {
	this.sides = sides; }
public ArrayList<Salad> getSalads() {
	return salads; }
public void setSalads(ArrayList<Salad> salads) {
	this.salads = salads; }
public ArrayList<Dessert> getDesserts() {
	return desserts; }
public void setDesserts(ArrayList<Dessert> desserts) {
	this.desserts = desserts;
	}
}

