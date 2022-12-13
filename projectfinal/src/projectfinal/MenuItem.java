package projectfinal;

//Protecting each constructor in order to make it be used in the subclasses
//defining
public class MenuItem {
protected String description;
protected int calories;
protected String name;
protected double price;

//Calling each constructor 
//declaring
public MenuItem(String description, int calories, String name, double price) {
this.description = description; 
this.calories = calories;
this.name = name;
this.price = price;
}
	
//Giving each constructor a value
//setting
public MenuItem() {
this.description = "";
this.calories = 0;
this.name = "";
this.price = 0.0;
}

//override
public String toString() {
return this.name; }

//Getters + setters of each constructor 

//Desc
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

//Name
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}


//Price
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;

//Leftover brackets
}
}