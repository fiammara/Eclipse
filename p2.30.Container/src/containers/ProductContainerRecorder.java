package containers;

public class ProductContainerRecorder extends ProductContainer {

	private ContainerHistory list2;
	public ProductContainerRecorder(String productName, double capacity, double initialVolume){
		super(productName, capacity);
		
	list2=new ContainerHistory();
	list2.add(initialVolume);
	super.addToTheContainer(initialVolume);
	
	}
	
	public String history(){
		
		return list2.toString();
	}
	
	public void addToTheContainer(double amount) {
		super.addToTheContainer(amount);
		list2.add(super.getVolume());
    }

    public double takeFromTheContainer(double amount) {
    	 double returnThis = super.takeFromTheContainer(amount);
         list2.add(super.getVolume());
         return returnThis;
}
    public void printAnalysis() {
        System.out.print(""
                + "Product: " + super.getName() + "\n"
                + "History: " + history() + "\n"
                + "Greatest product amount: " + list2.maxValue() + "\n"
                + "Smallest product amount: " + list2.minValue() + "\n"
                + "Average: " + list2.average() + "\n"
                + "Greatest change: " + list2.greatestFluctuation() + "\n"
                + "Variance: " + list2.variance() + "\n");
}
}