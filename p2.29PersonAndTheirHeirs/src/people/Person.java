package people;

public class Person {
	private String name;
	private String adress;

	public Person(String name, String adress) {
		this.setName(name);
		this.adress = adress;
	}

	public String toString() {
		return this.getName() + '\n' +"  "+ this.adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		this.name = newName;
	}
	public String getAdress() {
		return adress;
	}

	public void setAdress(String newAdress) {
		this.adress = newAdress;
	}
}
