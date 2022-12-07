//Lab Three: Conversion
package lab3;  
import javax.swing.JOptionPane;
public class UnitConverter {

public static void main(String[] args) {
System.out.println("Units: cm, in, yd, m, oz, g, lb, kg");
String writing = JOptionPane.showInputDialog("Please enter a number, space, and a unit:");
String unit;
double measurement, convert;
int splice = writing.indexOf(' '), length = writing.length();
	if(splice >= 0) {
		unit = writing.substring(splice + 1, length);
		measurement = Double.parseDouble(writing.substring(0,splice));
		switch(unit) {
		
//in to cm	
case "in": convert = measurement * 2.54;
System.out.println(writing + " = " + convert + " cm"); break;

//cm to in	
case "cm": convert = measurement / 2.54;
System.out.println(writing + " = " + convert + " in"); break;

//yd to m
case "yd": convert = measurement * .9144;
System.out.println(writing + " = " + convert + " m"); break;

//m to yd
case "m": convert = measurement / .9144;
System.out.println(writing + " = " + convert + " yd"); break;

//oz to g
case "oz": convert = measurement * 28.35;
System.out.println(writing + " = " + convert + " g"); break;

//g to oz
case "g":convert = measurement / 28.35;
System.out.println(writing + " = " + convert + " oz"); break;

//lb to kg
case "lb":convert = measurement * .4536;
System.out.println(writing + " = " + convert + " kg"); break;

//kg to lb
case "kg":convert = measurement / .4536;
System.out.println(writing + " = " + convert + " lb"); break;
}
}
}
}	

