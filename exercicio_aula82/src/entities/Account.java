package entities;

public class Account {
	private int accontNum;
	private String accontHol;
	//private String initialDepo;
	private double depositValue;

//construtor
	public Account(int accontNum, String accontHol, double depositValue) {
		this.accontNum = accontNum;
		this.accontHol = accontHol;
//		this.initialDepo = initialDepo;
		this.depositValue = depositValue;
	}

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

//	public String isInitialDepo() {
//		return initialDepo;
//	}
//
//	public void setInitialDepo(String initialDepo) {
//		this.initialDepo = initialDepo;
//	}

	public double getDepositValue() {
		return depositValue;
	}

	public void setDepositValue(double depositValue) {
		this.depositValue = depositValue;
	}

//metodos

}
