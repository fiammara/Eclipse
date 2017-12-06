
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Reader extends PhoneBook {
	private Scanner reader;
	private PhoneBook phone;
	private Map<String, Set<String>> book2;
	private Map<String, Set<String>> book3;

	public Reader() {
		this.reader = new Scanner(System.in);
		phone = new PhoneBook();
		book2 = phone.getNamePhone();
		book3 = phone.getNameAdress();
	}

	public void start() {

		System.out.println("phone search");
		System.out.println("available operations:");
		System.out.println("1 add a number ");
		System.out.println("2 search for a number ");
		System.out.println("3 search for a person by phone number");
		System.out.println("4 add an address ");
		System.out.println("5 search for personal information");
		System.out.println("6 delete personal information ");
		System.out.println("7 filtered listing ");
		System.out.println("x quit");

		while (true) {
			System.out.println("command: ");

			String command1 = reader.nextLine();

			if (command1.equals("1")) {
				add();
			}
			if (command1.equals("2")) {
				searchNum();
			}
			if (command1.equals("3")) {
				searchPerson();
			}
			if (command1.equals("4")) {
				addAdress();
			}
			if (command1.equals("5")) {
				Info();
			}
			if (command1.equals("6")) {
				Delete();
			}
			if (command1.equals("7")) {
				Filter();
			}

			if (command1.equals("x")) {
				break;
			}
		}
	}

	public void add() {
		book2 = phone.getNamePhone();
		System.out.println("whose number:");
		String name1 = reader.nextLine();
		System.out.println("number:");
		String num1 = reader.nextLine();

		Set<String> set2 = new HashSet<String>();
		set2.add(num1);
		if (book2.containsKey(name1)) {
			for (String n : book2.get(name1)) {

				set2.add(n);
			}
		}
		phone.setNamePhone(name1, set2);

	}

	public void searchNum() {
		System.out.println("whose number:");
		String name1 = reader.nextLine();

		if (book2.containsKey(name1) == false) {
			System.out.println("not found");
		} else {

			System.out.println(book2.get(name1));

		}
	}

	public void searchPerson() {
		System.out.println("number:");
		String num = reader.nextLine();
		for (String n : book2.keySet()) {

			if (book2.get(n).contains(num)) {
				System.out.println(n);
			} else {
				System.out.println("not found");
			}
		}
	}

	public void addAdress() {
		book3 = phone.getNameAdress();
		System.out.println("whose address:");
		String name1 = reader.nextLine();
		System.out.println("street:");
		String street = reader.nextLine();
		System.out.println("city:");
		String city = reader.nextLine();
		String adr = street + " " + city;

		Set<String> set2 = new HashSet<String>();
		set2.add(adr);
		if (book2.containsKey(name1)) {
			for (String n : book2.get(name1)) {

				set2.add(n);
			}
		}
		phone.setNameAdress(name1, set2);

	}

	public void Info() {
		System.out.println("whose information:");
		String name1 = reader.nextLine();

		if (book2.containsKey(name1) == false && book3.containsKey(name1) == false) {
			System.out.println("person not found");
		} else if (book3.get(name1) == null && book2.get(name1) == null) {
			System.out.println("adress unknown");
			System.out.println("phone number unknown");
		}

		else if (book3.get(name1) == null && book2.containsKey(name1)) {
			System.out.println("address unknown");

			for (String n : book2.get(name1))
				System.out.println(n);
		} else if (book2.get(name1) == null && book3.containsKey(name1)) {
			System.out.println("phone number not found");
			for (String n : book3.get(name1))
				System.out.println(n);
		} else {
			for (String n : book3.get(name1)) {
				System.out.println(n);
			}
			for (String n : book2.get(name1)) {
				System.out.println(n);
			}
		}
	}

	public void Delete() {
		System.out.println("whose information:");
		String name = reader.nextLine();
		phone.delete(name);
	}

	public void Filter() {
		System.out.println("keyword (if empty, all listed):");

		for (String n : book3.keySet()) {
			System.out.println(n);

			if (book3.get(n) != null) {
				for (String s : book3.get(n))
					System.out.println(s);
			}

			else {
				System.out.println("address not found");
			}

			if (book2.get(n) != null) {
				for (String s : book2.get(n))
					System.out.println(s);
			} else {
				System.out.println("phone number not found");
			}
		}
	}
}
