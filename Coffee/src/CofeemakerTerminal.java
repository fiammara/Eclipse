import java.util.Scanner;

public class CofeemakerTerminal {
	private Scanner reader;
	private CoffeeMaker coffee;

	public CofeemakerTerminal() {
		this.reader = new Scanner(System.in);
		coffee = new CoffeeMaker();

	}

	public void menu() {
		coffee.On();
		System.out.println("Menu: ");
		System.out.println("0 - finish ");
		System.out.println("1 - espresso ");
		System.out.println("2 - cappucino ");
		System.out.println("3 - fill milk");
		System.out.println("4 - fill beans");
		System.out.println("5 - fill water");
		System.out.println("6 - clean");

		while (true) {
			System.out.println("Enter command: ");

			int command1 = reader.nextInt();

			if (command1 == 0) {
				coffee.Off();
			}
			if (command1 == 1) {
				try {
					coffee.getEspresso();
				} catch (OffException e) {
					 System.out.println("Please turn on machine");					 
				}
				catch(WaterException e){
					System.out.println("Plase add water");
			      }
				catch(BeanException e){
					System.out.println("Please add beans");
			      } 
				
			}
			if (command1 == 2) {
				try {
					coffee.getCappuccino();
				} catch (OffException e) {
					 System.out.println("Please turn on machine");					 
				}
				catch(WaterException e){
					System.out.println("Plase add water");
			      }
				catch(BeanException e){
					System.out.println("Please add beans");
			      } 
				catch(MilkException e){
					System.out.println("Please add milk");
			      } 
				catch(CleaningException e){
					System.out.println("Please clean machine");
			      } 
				
			}
			if (command1 == 3) {
				coffee.addMilk();
			}
			if (command1 == 4) {
				coffee.addBeans();
			}
			if (command1 == 5) {
				coffee.addWater();
			}
			if (command1 == 6) {
				coffee.Clean();
			}
		}
	}
}