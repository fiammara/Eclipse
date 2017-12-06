import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
	private Map<String, Set<String>> NamePhone;
	private Map<String, Set<String>> NameAdress;

	public PhoneBook() {
		NamePhone = new HashMap<String, Set<String>>();
		NameAdress = new HashMap<String, Set<String>>();
	}

	public Map<String, Set<String>> getNamePhone() {
		return this.NamePhone;
	}

	public Map<String, Set<String>> getNameAdress() {
		return NameAdress;
	}

	public void setNamePhone(String map1, Set<String> set2) {

		NamePhone.put(map1, set2);
	}

	public void setNameAdress(String name, Set<String> set2) {
		NameAdress.put(name, set2);
	}

	public void delete(String name) {
		NameAdress.remove(name);
		NamePhone.remove(name);
	}

	@Override
	public String toString() {
		return "PhoneBook [NamePhone=" + NamePhone + ", NameAdress=" + NameAdress + "]";
	}

}