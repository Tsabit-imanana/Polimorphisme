package Latihan4;

public class Triangle extends Shape{
	private int base;
	private int heigth;
	
	public Triangle(String color, int base, int heigth) {
		super(color);
		this.base = base;
		this.heigth = heigth;
			
	}
	public String toString() {
		return "rectangle[base" + base + "heigth" + heigth + "," +super.toString()+ "]";
	}
	public double getArea = 0.5*base*heigth;
}
