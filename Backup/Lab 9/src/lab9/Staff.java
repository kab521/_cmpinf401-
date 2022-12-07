package lab9;

public class Staff extends Person {
	private String school;
	private double pay;
	public Staff(String name, String address, double pay) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	public String toString() {
		String s = "Staff Name: "+this.getName()+"\n"+"Staff Address:"+this.getAddress()+"\n"
				+"Staff School:"+this.getSchool()+"\n"+"Pay:"+this.getPay()+"\n";
		return s;
	}
	
}