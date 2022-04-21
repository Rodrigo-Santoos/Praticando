package entities;

public class Student_exer {

	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double finalMedia() {
		return nota1 + nota2 + nota3;
	}
	
	public double missingPoints() {
		if(finalMedia()< 60) {
			return 60 - finalMedia();
		}else {
			return 0.0;
		}
	}
	
}
