/**
	 * Class Dessert
 	 * author : kathryn bager
	 * created: 10/17/2022
	 */

package assignment1;
public class Dessert {
private String name;
private String description;	
private int calories = 0;
public Dessert(String name, String description, int cal) {
this.name = name;
this.description = description;
this.calories = cal;
	}

//before running, it made me have to make the method into a constructor, or else it wouldn't run (lines 19-20) (Same with every meal)
public Dessert() {
// TODO Auto-generated constructor stub
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
}