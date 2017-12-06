package transportation;

import com.eisgroup.javaexam.factory.Color;
import com.eisgroup.javaexam.factory.Transportation;
import com.eisgroup.javaexam.factory.TransportationFactory;
import com.eisgroup.javaexam.factory.test.BaseTransportationFactoryTest;

public class Factory extends BaseTransportationFactoryTest implements TransportationFactory {

	
	@Override
	public Transportation produceBoat(String make, String model, double price, Color color, double length) {
		Transportation boat = new Boats(make, model, price, color, length);
		
		// TODO Auto-generated method stub
		return boat;
	}

	@Override
	public Transportation produceCar(String make, String model, double price, Color color) {
		// TODO Auto-generated method stub
		Transportation car = new Cars(make, model, price, color);
		return car;
	}

	@Override
	protected TransportationFactory getTransportationFactory() {
		TransportationFactory factory = new Factory();
		// TODO Auto-generated method stub
		return factory;
	}
}
