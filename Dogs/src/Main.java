

public class Main {

	public static void main(String[] args) {
		
		DogFarm farm=new DogFarm();
		farm.getList().add(new Dogs("Pekinas", 2, "A"));
		farm.getList().add(new Dogs("Haskis", 1, "N"));
		farm.getList().add(new Dogs("Taksas", 3, "T"));
		farm.getList().add(new Dogs("Misrunas", 5, "T"));
		farm.getList().add(new Dogs("Laika", 3, "B"));
		farm.getList().add(new Dogs("Biglis", 5, "N"));
		farm.getList().add(new Dogs("Laika", 6, "B"));

		farm.sortAgeDesc();
		farm.print();
		
	}

}
