package junitteststest;

import com.eisgroup.javaexam.shapes.Shape;


public class Circle implements Shape {
	private double area;
	private double radius;
	
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		area=Math.PI*radius*radius;
		return area;
	}

}
