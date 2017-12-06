package transportation;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;

public class Cars extends Transportation {

	public Cars(String make, String model, double price, Color color) {
		super(make, model, price, color);
		// TODO Auto-generated constructor stub
	}
	
	public double getPrice() {
		return super.getPrice();
	}

	@Override
	public double getFinalPrice(){
		return super.getPrice()+(super.getPrice()*0.21);

	}

}
