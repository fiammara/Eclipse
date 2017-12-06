package containers;

public class ProductContainer extends Container {
private String productName;

	public ProductContainer(String productName, double capacity) {
		super(capacity);
		this.productName=productName;
		
	}
	public String getName() {
		return productName;
	}
	public void setName(String newName) {
		this.productName=newName;
	}
	public String toString(){
		return getName()+": "+ "volume = " + getVolume() + ", free space " + getCurrentCapacity();
		
	}
	
}
