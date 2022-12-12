package kab521_MenuManager_v2;
public class Dessert {
private String description;	
private String name;
private int calories = 0;
public Dessert(String name, String description, int cal) {
this.calories = cal;
this.name = name;
this.description = description;

}
public Dessert() 
{
}
public String getName() 
{
return name;
}
public void setName(String name) 
{
this.name = name;
}
public String getDescription() 
{
return description;
}
public void setDescription(String description) 
{
this.description = description;
}
public int getCalories() 
{
return calories;
}
public void setCalories(int calories)
{
this.calories = calories;
}
}