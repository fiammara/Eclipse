package transportation;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class Boats extends Transportation {

private double length;

	public Boats(String make, String model, double price, Color color, double length) {
		super(make, model, price, color);
		this.length=length;
		// TODO Auto-generated constructor stub
	}
	public double getPrice() {
		return super.getPrice();
	}
	
	public double getLength() {
		// TODO Auto-generated method stub
		return length;
		
	}
	@Override
	public double getFinalPrice() {
		return super.getPrice()+(super.getPrice()*0.21);
		// TODO Auto-generated method stub
	
	}
}
