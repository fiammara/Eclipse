import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class VehicleRegister {

	private HashMap<RegistrationPlate, String> owners;

	public VehicleRegister() {

		this.owners = new HashMap<RegistrationPlate, String>();
	}

	public boolean add(RegistrationPlate plate, String owner) {
		if (owners.containsKey(plate) == false) {
			owners.put(plate, owner);
			return true;
		} else {
			return false;
		}
	}

	public String get(RegistrationPlate plate) {
		if (owners.containsKey(plate)) {
			return owners.get(plate);
		} else {
			return null;
		}
	}

	public void printRegistrationPlates() {

		for (RegistrationPlate n : owners.keySet()) {
			System.out.println(n);
		}
	}

	public void printOwners() {

		List<String> list = new ArrayList<String>();

		for (String n : owners.values()) {
			if (!list.contains(n)) {
				list.add(n);
			}
		}
		for (String s : list) {
			System.out.println(s);
		}

	}

	public boolean delete(RegistrationPlate plate) {
		if (owners.get(plate) == null) {
			return false;
		} else {
			owners.remove(plate);
			return true;
		}
	}
}
