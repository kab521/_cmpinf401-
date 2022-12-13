package assignment1;

//Getters and Setters for Description, Calories, Price, and Name!

public class MenuItem {
	
//Protecting each...property?
protected String name;
protected String description;
protected int calories;
protected double price;

public MenuItem(String name, String description, int calories, double price) {
this.name = name;
this.description = description;
this.calories = calories;
this.price = price;
}
public MenuItem() {
this.name = "";
this.description = "";
this.calories = 0;
this.price = 0.0;
}

//Name
public String toString() {
return this.name;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}

//Description
public String getDescription() {
return description;
}
public void setDescription(String description) {
this.description = description;
}

//Cals
public int getCalories() {
return calories;
}
public void setCalories(int calories) {
this.calories = calories;
}

//Price
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;

	}

}