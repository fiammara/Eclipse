package junitteststest;

import com.eisgroup.javaexam.shapes.Shape;
import com.eisgroup.javaexam.shapes.ShapeFactory;
import com.eisgroup.javaexam.shapes.tests.BaseShapeFactoryTest;

public class Factory extends BaseShapeFactoryTest implements Shape, ShapeFactory{
	
	public Factory(){
		
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.getArea();
	}

	@Override
	public Shape createCircle(double radius) {
		Shape circle=new Circle(radius);
	
		return circle;
	}

	@Override
	public Shape createRectangle(double a, double b) {
		Shape rectangle=new Rectangle(a, b);
		return rectangle;
	}

	@Override
	protected ShapeFactory createShapeFactory() {
		ShapeFactory shapes=new Factory ();
		return shapes;
					
	}
	
}
