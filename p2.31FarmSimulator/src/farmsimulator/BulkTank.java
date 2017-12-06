package farmsimulator;

public class BulkTank {
	private double capacity;
	private double volume;
	

	public BulkTank() {
		super();
		this.capacity = 2000.0;
		
	}

	public BulkTank(double capacity) {
		super();
		this.capacity =capacity;
		
	}

	public double getCapacity() {
		return this.capacity;
	}

	public double getVolume() {
		return volume;
	}

	public double howMuchFreeSpace() {
		double space=this.capacity-this.volume;
		return space;
	}

	public void addToTank(double amount) {
		
		if (amount <= howMuchFreeSpace()) {
			
			volume = volume+amount;
		} else {
			
			volume = capacity;
		}
	}
	

	public double getFromTank(double amount) {
		if (amount <= volume) {
			this.volume = volume - amount;			
		}
		else {this.volume =0.00;	
		}
		return this.volume;
	}

	@Override
	public String toString() {
		return  Math.ceil(getVolume())+ "/"+ Math.ceil(capacity);
	}

}
