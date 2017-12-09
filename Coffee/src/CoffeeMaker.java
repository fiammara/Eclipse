
public class CoffeeMaker {

	private boolean state;
	private boolean isWater;
	private int cupcounter;
	private boolean Beans;
	private int beanscounter;
	private boolean Milk;
	private int milkcounter;

	private int washcounter;

	public int getMilkcounter() {
		return milkcounter;
	}

	public void setMilkcounter(int milkcounter) {
		this.milkcounter = milkcounter;
	}

	public CoffeeMaker() {
		state = false;

	}

	public Espresso getEspresso() throws OffException, WaterException, BeanException{
		if (state == false)
			throw new OffException();
		if (cupcounter == 0)
			throw new WaterException();
		if (beanscounter == 0)
			throw new BeanException();

		Espresso esp = new Espresso();
		setCupcounter(cupcounter - 1);
		setBeanscounter(beanscounter - 1);
		return esp;
	}

	public int getCupcounter() {
		return cupcounter;
	}

	public void setCupcounter(int cupcounter) {
		this.cupcounter = cupcounter;
	}

	public int getBeanscounter() {
		return beanscounter;
	}

	public void setBeanscounter(int beanscounter) {
		this.beanscounter = beanscounter;
	}

	public Cappuccino getCappuccino() throws  OffException, WaterException, BeanException, MilkException, CleaningException  {
		
		if (state == false)
			throw new OffException();
		if (cupcounter == 0)
			throw new WaterException();
		if (beanscounter == 0)
			throw new BeanException();
		
		if (milkcounter == 0)
			throw new MilkException();
		if (washcounter == 7)
			throw new CleaningException();
		Cappuccino cap = new Cappuccino();
		setCupcounter(cupcounter - 1);
		setBeanscounter(beanscounter - 1);
		setMilkcounter(milkcounter - 1);
		washcounter++;
		return cap;
	}

	public boolean isOn() {
		setCupcounter(0);
		setBeanscounter(0);
		setMilkcounter(0);
		return this.state;
	}

	public void Off() {
		this.state = false;
	}

	public void On() {
		this.state = true;
	}

	public boolean isWater() {
		System.out.println("there is water for " + cupcounter + " cups");
		return this.isWater;

	}

	public boolean isMilk() {
		System.out.println("there is milk left for " + milkcounter + " cups");
		return this.Milk;

	}

	public boolean Beans() {
		System.out.println("there are beans for " + beanscounter + " cups");
		return this.Beans;
	}

	public boolean addWater() {
		cupcounter = 15;
		return this.isWater = true;
	}

	public boolean addBeans() {
		beanscounter = 5;
		return this.Beans = true;
	}

	public boolean addMilk() {
		milkcounter = 10;
		return this.Milk = true;
	}

	public void Clean() {
		washcounter = 0;
	}
}
