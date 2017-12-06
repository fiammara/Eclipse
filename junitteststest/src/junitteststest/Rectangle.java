package junitteststest;

import com.eisgroup.javaexam.shapes.Shape;

public class Rectangle implements Shape {
	private double area;
	private double a;
	private double b;

	
	public Rectangle( double a, double b) {
		super();
	
		this.a = a;
		this.b = b;
	}

	@Override
	public double getArea() {
		area=a*b;
		return area;
	}
	

}
