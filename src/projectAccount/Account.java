package projectAccount;

public class Account {
	
	private int numberAccount;
	private String nameAccount;
	private double valueAccount;
	
	/* CONSTRUCTS */
		// Without value
	public Account(int numberAccount, String nameAccount) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		this.valueAccount = 0.0;
	}
		// With value	
	public Account(int numberAccount, String nameAccount, double depositMoney) {
		this.numberAccount = numberAccount;
		this.nameAccount = nameAccount;
		this.depositMoney(depositMoney);;
	}
	
	// GET & SET
	public int getNumberAccount() {
		return numberAccount;
	}
	public String getNameAccount() {
		return nameAccount;
	}
	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	public double getValueAccount() {
		return valueAccount;
	}
	public void setValueAccount(double valueAccount) {
		this.valueAccount = valueAccount;
	}

	// TO_STRING
	@Override
	public String toString() {
		return "Account N.: " + numberAccount + ", Holder: " + nameAccount + 
				", Balance: $ " + String.format("%.2f", valueAccount);
	}
	
	// METHODS
	public void takeMoney(double value) {
		this.setValueAccount(getValueAccount() - value - 5.0);
	}
	
	public void depositMoney(double value) {
		this.setValueAccount(getValueAccount() + value);
	}
	
}