
public class NumberStatistics {
	//private int amountOfNumbers;
	private int count;
	private int sum;
	
	
	//private int number;
	//private double average;
	
	public NumberStatistics(){
		//this.amountOfNumbers=amountOfNumbers();
		
		this.sum=sum();
			
	}
	public void addNumber(int number) {
		//this.number=number;
		this.sum=sum+number;
		count++;
	}
	public int amountOfNumbers(){		
		
		return count;
	}
	public int sum(){
		return sum;		
	}
	public double average(){
		if (amountOfNumbers()!=0)
				{
		double average=((double)sum())/amountOfNumbers();
		return average;
		}
		else {
				return 0;
	}
}
}