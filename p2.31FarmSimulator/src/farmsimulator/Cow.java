package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive {

	private double amount;

	private int capacity;
	private String name;
	private double milk;
	
	
	private static final String[] NAMES = new String[] { "Anu", "Arpa", "Essi", "Heluna", "Hely", "Hento", "Hilke",
			"Hilsu", "Hymy", "Doge", "Ilme", "Ilo", "Jaana", "Jami", "Jatta", "Laku", "Liekki", "Mainikki", "Mella",
			"Mimmi", "Naatti", "Nina", "Nyytti", "Papu", "Pullukka", "Pulu", "Rima", "Soma", "Sylkki", "Valpu",
			"Virpi" };

	public Cow() {
		super();
		Random randomNum = new Random();
		this.name = NAMES[randomNum.nextInt(31)];

		this.capacity = 15 + randomNum.nextInt(26);
	}

	public Cow(String name) {
		super();
		Random randomNum = new Random();
		this.name = name;
		this.capacity = 15 + randomNum.nextInt(26);
	}

	public String getName() {
		return this.name;
	}

	public double getCapacity() {

		return this.capacity;
	}

	public double getAmount() {
		return this.amount;
	}

	@Override
	public String toString() {
		return getName() + " " + milk() + "/" + getCapacity();
	}

	@Override
	public double milk() {
		milk=this.amount;
		this.amount = 0.00;
		return milk;
	}

	@Override
	public void liveHour() {

		Random randomNum = new Random();
		double i = Math.ceil(0.7 + randomNum.nextDouble() * 1.3); 
		
		if (i + this.amount <= getCapacity()) {
			this.amount +=i;
		} else {
			this.amount = getCapacity();
		}
	}
}
