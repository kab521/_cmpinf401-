package kab521_MenuManager_v3;

public class MenuItem {
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

public String toString() {
return this.name;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public String getDescription() {
return description;
}

public void setDescription(String description) {
this.description = description;
}

public int getCalories() {
return calories;
}

public void setCalories(int calories) {
this.calories = calories;
}

public double getPrice() {
return price;
}

public void setPrice(double price) {
this.price = price;
}
}