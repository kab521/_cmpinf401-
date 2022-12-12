package finalproject;

//Imports to build the gui
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.Dimension;

//I do not know why it needed a dollar sign to work, but it did 
public class $MenuManagerGUI {

//Listing all the parameters of the gui, like text boxes and drop downs
private Menuorganizer menuManager;
private JTextArea  saladword, sideword, entreeword, dessertword;
private JLabel selfmademenuslabel, saladlabel, sidelabel, entreelabel,  sidetwo, desslabel, saladtwo, entreetwo, desstwo, totprice, totcals;
private JPanel allthestuff, medscreen, somanywindows, mainscreen, smallscreen;
private JFrame thewindow, outputwindow;
private JTextField pricecals, textcals;
private JButton buttmakerando, buttsubmitmenu, deletebutt, buttinfo, buttkeep;
private JComboBox dessdrop, sidedrop, saladdrop, entreedrop;

private JList<String> allmenus;
private ArrayList <Mainmenu> menus = new ArrayList<Mainmenu>();
private DefaultListModel <String> menutemplate = new DefaultListModel<>();

public static void main(String[] args)
{
$MenuManagerGUI gui = new $MenuManagerGUI();
}

public $MenuManagerGUI() 
{
this.menuManager = new Menuorganizer("data/meals.txt");
buildoutputwindow();
}

//size of main window
private void buildoutputwindow() {
this.outputwindow = new JFrame("Menu Manager");
outputwindow.setBounds(440, 230, 710, 510);

//i think you close it this way	and need to seperate it from the sizing part
outputwindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
outputwindow.setLayout(null);

//Making the drop downs: their size and label name
this.entreelabel = new JLabel("entree:");
entreelabel.setBounds
(20, 40, 60, 10);

this.sidelabel = new JLabel("side:");
sidelabel.setBounds
(entreelabel.getX(),
entreelabel.getY() + entreelabel.getHeight() * 1 + 20, 
entreelabel.getWidth(), entreelabel.getHeight());
		
this.saladlabel = new JLabel("salad:");
saladlabel.setBounds
(entreelabel.getX(),
entreelabel.getY() + entreelabel.getHeight() * 2 + 40,
entreelabel.getWidth(), entreelabel.getHeight());

this.desslabel = new JLabel("dessert:");
desslabel.setBounds
(entreelabel.getX(), 
entreelabel.getY() + entreelabel.getHeight() * 3 + 60, 
entreelabel.getWidth(), entreelabel.getHeight());

//distance of meal name and drop down
this.entreedrop = 
new JComboBox(menuManager.getEntrees().toArray());
entreedrop.setBounds(entreelabel.getX() + entreelabel.getWidth() + 5,
entreelabel.getY(), 150, 33);

this.sidedrop = 
new JComboBox(menuManager.getSides().toArray());
sidedrop.setBounds(sidelabel.getX() + sidelabel.getWidth() + 5, sidelabel.getY(),
entreedrop.getWidth(), entreedrop.getHeight());

this.saladdrop =
new JComboBox(menuManager.getSalads().toArray());
saladdrop.setBounds(saladlabel.getX() + saladlabel.getWidth() + 5, saladlabel.getY(),
entreedrop.getWidth(), entreedrop.getHeight());

this.dessdrop = new JComboBox(menuManager.getDesserts().toArray());
dessdrop.setBounds(desslabel.getX() + desslabel.getWidth() + 5, desslabel.getY(),
entreedrop.getWidth(), entreedrop.getHeight());

//Sizing the "create?" button and first line gets you to name it
this.buttsubmitmenu = new JButton("Create?");
buttsubmitmenu.setBounds(desslabel.getX() - 0,
desslabel.getY() + 30, entreedrop.getWidth() + 2,
entreedrop.getHeight() + 2);

this.medscreen = new JPanel();
this.medscreen.setLayout(null);
this.medscreen.setBorder(BorderFactory.createTitledBorder("Create your own menu here!")); this.medscreen.setBounds(10, 10, outputwindow.getWidth()/2 - 10, outputwindow.getHeight() /2);

//label of the drop down, on the left
this.medscreen.add(entreelabel);
this.medscreen.add(sidelabel);
this.medscreen.add(saladlabel);
this.medscreen.add(desslabel);

//making the drop downs appear at all
this.medscreen.add(entreedrop);
this.medscreen.add(sidedrop);
this.medscreen.add(saladdrop);
this.medscreen.add(dessdrop);
this.medscreen.add(buttsubmitmenu);

//button for user to click a button for a random menu
this.buttmakerando = new JButton("Make a random menu");
buttmakerando.setBounds(buttsubmitmenu.getX(), entreelabel.getY(),
buttsubmitmenu.getWidth(), buttsubmitmenu.getHeight());
		
//Make a menu for me! screen sizing
this.smallscreen = new JPanel();
this.smallscreen.setLayout(null);
this.smallscreen.setBorder(BorderFactory.createTitledBorder("Make a menu for me!"));
this.smallscreen.setBounds(10, medscreen.getY()+medscreen.getHeight() + 10,

//I don't know why you have to divide when doing width ^
outputwindow.getWidth()/3-12, outputwindow.getHeight()/4-20);
this.smallscreen.add(buttmakerando);

this.allmenus = new JList(menutemplate);
allmenus.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
allmenus.setVisibleRowCount(9);
allmenus.setBorder(BorderFactory.createLineBorder(Color.BLACK));
allmenus.setBounds(90, 20, outputwindow.getWidth()/2-40, outputwindow.getHeight()-300);

//More sizing and distance of the Menus made by you! box
this.allthestuff = new JPanel();
this.allthestuff.setLayout(null);
this.allthestuff.setBorder(BorderFactory.createTitledBorder("Menus made by you!"));
this.allthestuff.setBounds(medscreen.getWidth() + 30, 
medscreen.getY(), outputwindow.getWidth()/1-10, outputwindow.getHeight()-20);

//menu buttons - label, size, and distance
//more info
this.buttinfo = new JButton("more info");
buttinfo.setBounds(allmenus.getX(),
allmenus.getY() + allmenus.getHeight() + 10, allmenus.getWidth()/3-9, buttsubmitmenu.getHeight());
//delete	
this.deletebutt = new JButton("delete");
deletebutt.setBounds(buttinfo.getX() 
+ buttinfo.getWidth() + 2, buttinfo.getY(), buttinfo.getWidth(), buttinfo.getHeight());
//export
this.buttkeep = new JButton("export");
buttkeep.setBounds(deletebutt.getX()
+ deletebutt.getWidth() + 2, deletebutt.getY(), deletebutt.getWidth(), deletebutt.getHeight());

//Adding the buttons to the screen
this.allthestuff.add(allmenus);
this.allthestuff.add(buttinfo);
this.allthestuff.add(buttkeep);
this.allthestuff.add(deletebutt);

//Adding windows and boxes to the screen
this.mainscreen = new JPanel();


//literally the entire screen 
this.mainscreen.setLayout(null);
this.outputwindow.setContentPane(mainscreen);
this.mainscreen.add(this.medscreen);



//randomizer box adder
this.mainscreen.add(this.smallscreen);
//output of all menus adder
this.mainscreen.add(this.allthestuff);

//adding and overriding a method but also asking user for menu names within the choice selected menu
buttsubmitmenu.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e) {
String userpickedname = JOptionPane.showInputDialog("What is the name of your menu?");
if(userpickedname==null||userpickedname.equals("")) {
JOptionPane.showMessageDialog(null, "Please enter a name.");
return;
}

//drop down of user's choice-selected menu
entrees entree = (entrees) entreedrop.getSelectedItem();
sides side = (sides) sidedrop.getSelectedItem();
salads salad = (salads) saladdrop.getSelectedItem();
desserts dessert = (desserts) dessdrop.getSelectedItem();
Mainmenu menu = new Mainmenu(userpickedname, entree, side, salad, dessert); menus.add(menu);
menutemplate.addElement(menu.getName());
allmenus.setModel(menutemplate);
}});

//adding and more overriding - asking user for name of the menu within the randomized button
buttmakerando.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String username = JOptionPane.showInputDialog("What is the name of your random menu?");
	if(username == null || username.equals("")) {
	JOptionPane.showMessageDialog(null, "Please enter a name.");
	return;
}				
Mainmenu menu = menuManager.randomMenu(username);
menus.add(menu);
menutemplate.addElement(menu.getName());
allmenus.setModel(menutemplate);
}});	
buttinfo.addActionListener(new ActionListener() {

//if user does not selected a menu before pressing "more info"
	public void actionPerformed(ActionEvent e)
{
int library = allmenus.getSelectedIndex();
	if(library == -1) 
{
JOptionPane.showMessageDialog(null, "Please click on the menus on the sidebar in order to see the contents.");
return;
}
Mainmenu manymenu = menus.get(library);
generatethewindow(manymenu);
}});

		

//overriding the method - making the delete all button work
//i can only make it delete all of it, not just one menu
deletebutt.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
menus.removeAll(menus);
menutemplate.removeAllElements();
allmenus.setModel(menutemplate);
}});

//overriding the method - making the more info button work
buttkeep.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
	if(menus.size() == 0) {
	JOptionPane.showMessageDialog(null, "Please make a menu first-- either random or chosen.");
	return;
}
FileManager.writeMenu("data/menus.txt", menus);
}});
outputwindow.setVisible(true);
}

public void generatethewindow(Mainmenu menu) {
this.thewindow = new JFrame("Menu: " + menu.getName());
thewindow.setLayout(null);
thewindow.setBounds(outputwindow.getX() + 100,
outputwindow.getY()-50, outputwindow.getWidth() - 10, 
outputwindow.getHeight() + 90);


entreetwo = new JLabel("Entree");
entreetwo.setBounds(40,30,entreelabel.getWidth()+30,entreelabel.getHeight());

//once a user selects more info, this code will show through 

//for entree
entreeword = new JTextArea();
String enstr = menu.getEntree().getName() + "\nDescription: " + menu.getEntree().getDescription()
+ "\nCalories: " +menu.getEntree().getCalories() + "\nPrice: " + menu.getEntree().getPrice();
entreeword = new JTextArea(enstr);
entreeword.setBorder(BorderFactory.createLineBorder(Color.PINK));
entreeword.setWrapStyleWord(true);
entreeword.setLineWrap(true);
entreeword.setBounds(entreetwo.getX()+entreetwo.getWidth() + 20, entreetwo.getY(),
thewindow.getWidth()-entreetwo.getWidth()-120, buttmakerando.getHeight() * 2 + 30);
entreeword.setEditable(false);


//for side
sidetwo = new JLabel("Side");
sidetwo.setBounds(entreetwo.getX(),entreeword.getY()+entreeword.getHeight()+20,
entreetwo.getWidth(),entreetwo.getHeight());

sideword = new JTextArea();
String sidestr = menu.getSide().getName() + "\nDescription: " + menu.getSide().getDescription()
+ ".\nCalories: " + menu.getSide().getCalories()+"\nPrice: " + menu.getSide().getPrice();
sideword = new JTextArea(sidestr);
sideword.setBorder(BorderFactory.createLineBorder(Color.PINK));
sideword.setLineWrap(true);
sideword.setWrapStyleWord(true);
sideword.setBounds(entreeword.getX(),sidetwo.getY(),entreeword.getWidth(),entreeword.getHeight());
sideword.setEditable(false);

//for salad
saladtwo = new JLabel("Salad");
saladtwo.setBounds(sidetwo.getX(),sidetwo.getY() + sideword.getHeight() + 20,
sidetwo.getWidth(),sidetwo.getHeight());
saladword = new JTextArea();
String saladstr = menu.getSalad().getName() + "\nDescription: " + menu.getSalad().getDescription()
+ ".\nCalories: " + menu.getSalad().getCalories() + "\nPrice: " + menu.getSalad().getPrice();
saladword = new JTextArea(saladstr);
saladword.setBorder(BorderFactory.createLineBorder(Color.PINK));
saladword.setLineWrap(true);
saladword.setWrapStyleWord(true);
saladword.setBounds(sideword.getX(), saladtwo.getY(), sideword.getWidth(), sideword.getHeight());
saladword.setEditable(false); 

//for dessert		
desstwo = new JLabel("Dessert");
desstwo.setBounds(saladtwo.getX(),saladtwo.getY() + saladword.getHeight() + 20,
saladtwo.getWidth(), saladtwo.getHeight());
dessertword = new JTextArea();
String desstr = menu.getDessert().getName() + "\nDescription: " + menu.getDessert().getDescription()
+ ".\nCalories: " + menu.getDessert().getCalories() + "\nPrice: " + menu.getDessert().getPrice();
dessertword = new JTextArea(desstr);
dessertword.setBorder(BorderFactory.createLineBorder(Color.PINK));
dessertword.setLineWrap(true);
dessertword.setWrapStyleWord(true);
dessertword.setBounds(saladword.getX(),desstwo.getY(), saladword.getWidth(), saladword.getHeight());
dessertword.setEditable(false);
		
//cals box
totcals = new JLabel("Calories:");
totcals.setBounds(entreetwo.getX(), dessertword.getY() + dessertword.getHeight() + 20, 
entreetwo.getWidth(), entreetwo.getHeight());

//displaying the cal box
String cal = String.valueOf(menu.totcals());
textcals = new JTextField(cal);
textcals.setBounds(dessertword.getX(), totcals.getY(), totcals.getWidth(), buttsubmitmenu.getHeight());
textcals.setBorder(BorderFactory.createLineBorder(Color.PINK));
textcals.setEditable(false);
	
//price box
totprice = new JLabel("Price:");
totprice.setBounds(totcals.getX(), totcals.getY() + totcals.getHeight() + 20,
totcals.getWidth(), totcals.getHeight());

//displaying price box
String price = "$" + String.valueOf(menu.totprice());
pricecals = new JTextField(price);
pricecals.setBounds(dessertword.getX(), totprice.getY(), totprice.getWidth(), buttsubmitmenu.getHeight());
pricecals.setBorder(BorderFactory.createLineBorder(Color.PINK));
pricecals.setEditable(false);
	
//displaying every box
thewindow.getContentPane().add(entreeword);thewindow.getContentPane().add(entreetwo);
thewindow.getContentPane().add(totcals);thewindow.getContentPane().add(textcals);
thewindow.getContentPane().add(saladtwo);thewindow.getContentPane().add(saladword);
thewindow.getContentPane().add(desstwo); thewindow.getContentPane().add(dessertword);
thewindow.getContentPane().add(totprice); thewindow.getContentPane().add(pricecals);
thewindow.getContentPane().add(entreeword);thewindow.getContentPane().add(entreetwo);
thewindow.getContentPane().add(sidetwo);thewindow.getContentPane().add(sideword);
thewindow.setVisible(true);
}
}