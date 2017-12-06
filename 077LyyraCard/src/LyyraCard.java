
public class LyyraCard {
	private double balance;

	public LyyraCard(double balanceAtStart) {
		this.balance = balanceAtStart;
	}

	public String toString() {
		return "The card has " + this.balance + " Euros";
	}

	public void payEconomical() {
		if (balance - 2.50 >= 0) {
			this.balance = balance - 2.50;
		}
	}

	public void payGourmet() {
		if (balance - 4.00 >= 0) {
			this.balance = balance - 4.00;
		}
	}

	public void loadMoney(double amount) {
		
		 if (balance + amount <= 150 & amount>0) {
			this.balance = balance + amount;
		} else if (balance + amount > 150 & amount>0) {
			this.balance = 150;
		}
	}
}
