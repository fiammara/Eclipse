
import java.util.Set;

public class Persons {
	private String name;
	private Set<String> phone;
	private String adress;

	public Persons(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getPhone() {
		return phone;
	}

	public void setPhone(Set<String> phone) {
		this.phone = phone;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Persons [name=" + name + ", phone=" + phone + ", adress=" + adress + "]";
	}

}
