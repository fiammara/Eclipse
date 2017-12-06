package people;

public class Student extends Person {
	
	private int credits;
	public Student(String name, String adress) {
		super(name, adress);
		
	}
	public void study(){
		credits++;
	}
	public int credits(){
		
		return credits;
	}
	public String toString() {
		return this.getName() + '\n' + "  "+ this.getAdress()+ '\n' +"  "+ "credits "+ credits();
	}

}
