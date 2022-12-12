package finalproject;
import java.util.ArrayList;
import java.util.Random;

public class Menuorganizer {
private ArrayList<entrees> entrees;
private ArrayList<sides> sides;
private ArrayList<salads> salads;
private ArrayList<desserts> desserts;

public Menuorganizer(String mealsfile) {

ArrayList<MenuItem> items = FileManager.readItems(mealsfile);
entrees = new ArrayList<entrees>();
sides = new ArrayList<sides>();
salads = new ArrayList<salads>();
desserts = new ArrayList<desserts>();
	
	for (MenuItem item:items) {
		if (item.getClass() == entrees.class) {
		this.entrees.add((entrees) item); }
		if (item.getClass() == sides.class) {
		this.sides.add((sides) item); }
		if (item.getClass() == salads.class) {
		this.salads.add((salads) item); }
		if (item.getClass() == desserts.class) {
		this.desserts.add((desserts) item);
		}
	}
}

public Mainmenu randomMenu(String name) 
{
Random r = new Random();
Mainmenu menu = new Mainmenu(name, entrees.get(r.nextInt(0, this.entrees.size())),
sides.get(r.nextInt(0, this.sides.size())), salads.get(r.nextInt(0, this.salads.size())),
desserts.get(r.nextInt(0, this.desserts.size())));
return menu; 
}
public ArrayList<entrees> getEntrees() 
{
return entrees; 
}
public void setEntrees(ArrayList<entrees> entrees) 
{
this.entrees = entrees; 
}

public ArrayList<sides> getSides() 
{
return sides; 
}
public void setSides(ArrayList<sides> sides) 
{
this.sides = sides; 
}

public ArrayList<salads> getSalads() 
{
return salads; 
}
public void setSalads(ArrayList<salads> salads) 
{
this.salads = salads; 
}

public ArrayList<desserts> getDesserts() 
{
return desserts; 
}
public void setDesserts(ArrayList<desserts> desserts) 
{
this.desserts = desserts;
}
}

