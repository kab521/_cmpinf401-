package lab9;

public class Student extends Person{
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super();
		this.setName(name);
		this.setAddress(address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public String toString() {
		String s = "Student Name: "+this.getName()+"\n"+"Student Address:"+this.getAddress()+"\n"
				+"Student Program:"+this.getProgram()+"\n"+"Year:"+this.getYear()+"\n"+"Fee:"+this.getFee()+"\n";
		return s;
		//could not find out how to make a driver similar to task 1
	}
	
}