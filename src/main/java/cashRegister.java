
public class cashRegister {

	private double balance;

	public cashRegister(double startBalance) {
		{
			balance = startBalance;
		}
	}

	public void addMoney(double addAmount) {
		balance = balance + addAmount;
	}

	public void removeMoney(double removeAmount) {
		balance = balance - removeAmount;
	}


	public double calculateTax(double taxRate, double bill) {
		double tax = bill * taxRate;
		return tax;
	}
	public double getBalance() {
		return balance;
	}

}
 