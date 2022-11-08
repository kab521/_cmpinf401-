package lab6;

public class Lab6  {

	public static void main(String[] args) {
	}

	private int X;
	private int Y;
	private int width;
	private int height;

public Lab6()
	{
		this.X = 0;
		this.Y = 0;
		this.height = 0;
		this.width = 0;

	}

public Lab6(int x, int y, int w, int h)
	{
		this.X = x;
		this.Y = y;
		this.width = w;
		this.height = h;
	}

public int area()
	{
		int res = this.width*this.height;
		return res;
	}

public String toString()
	{
		StringBuilder S = new StringBuilder();
		S.append("Width: " + width);
		S.append(" Height: " + height);
		S.append(" X: " + X);
		S.append(" Y: " + Y);
		return S.toString();
	}

public boolean isInside(int x, int y)
	{
	return (x >= this.X && x <= (this.X+this.width)) && (y >= this.Y && y <= (this.Y+this.height));

	}

public void setSize(int w, int h)
	{
	this.width = w;
	this.height = h;
	
	}
public void setPosition(int x, int y)
	{
	this.X = x;
	this.Y = y;
	}

}
