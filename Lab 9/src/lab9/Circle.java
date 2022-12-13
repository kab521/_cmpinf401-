package lab9;	
public class Circle {
	
//setting the values of a circle
private double radius = 5.0;
private String color = "Green";
final double pi = 3.14;

public Circle() {	
}
public Circle(double radius) {
this.radius = radius;
}
public Circle(double radius, String color) {
this.color = color;
this.radius = radius;
}
public double getRadius() {
 return radius;
 }
 public void setRadius(double radius) {
 this.radius = radius;
 }
 public String getColor() {
 return color;
 }
 public void setColor(String color) {
 this.color = color;
 }	
 public double getArea() {

//i think this sends over the values to a cylinder
 return pi * radius * radius;
 	}
 }
