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
		addDepo(depositValue);
	}
	
	public Account(int accontNum, String accontHol ) {
		this.accontNum = accontNum;
		this.accontHol = accontHol;
		
	}

//------------------------------------------------------------------------------------------------------------------------------
//Getters e Setters
	public int getAccontNum() {
		return accontNum;
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
		return "Account " + getAccontNum() + "," + " Holder: " + getAccontHol() + ", " + "Balance: "
				+ String.format("$ %.2f", getDepositValue());
	}

	// pulando linha para dar espaço
	public void pularLinha() {
		System.out.println();
	}

	// add deposit
	public double addDepo(double add) {
		depositValue += add;
		setDepositValue(depositValue);
		return getDepositValue();
	}

	// cash withdrawal
	public double withCash(double withdraw) {
		depositValue += - withdraw - 5.00;
		setDepositValue(depositValue);
		return getDepositValue();
	}

}
