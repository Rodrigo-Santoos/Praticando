package entities;

public class Account {
	private int accontNum;
	private String accontHol;
	private double depositValue;

//------------------------------------------------------------------------------------------------------------------------------
//construtor
	public Account(int accontNum, String accontHol, double depositValue) {
		this.accontNum = accontNum;
		this.accontHol = accontHol;
		this.depositValue = depositValue;
	}

//------------------------------------------------------------------------------------------------------------------------------
//Getters e Setters
	public int getAccontNum() {
		return accontNum;
	}

	public void setAccontNum(int accontNum) {
		this.accontNum = accontNum;
	}

	public String getAccontHol() {
		return accontHol;
	}

	public void setAccontHol(String accontHol) {
		this.accontHol = accontHol;
	}

	public double getDepositValue() {
		return depositValue;
	}

	public void setDepositValue(double depositValue) {
		this.depositValue = depositValue;
	}

//------------------------------------------------------------------------------------------------------------------------------
//metodos

	// print
	public String toString() {
		return "Account " + getAccontNum() + ", " + " Holder: " + getAccontHol() + ", " + "Balance: "
				+ String.format("$ %.2f", getDepositValue());
	}

	// add deposit
	public double addDepo(double repo, double add) {
		this.depositValue += add;
		repo += + add;
		setDepositValue(depositValue);
		return getDepositValue();

	}
	
	// cash withdrawal
	public double withCash(double deposi, double withdraw) {
		
		this.depositValue += - withdraw - 5.00;
		setDepositValue(depositValue);
		return getDepositValue();
	}

}
