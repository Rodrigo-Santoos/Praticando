package entities;

public class Triangulo {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		
		double p = (a + b + c) / 2.0;
		
		//posso fazer dessa maneira
//		double resultado = Math.sqrt(p * (p - a) * (p - b) * (p - c));
//		return resultado;
//------------------------------------------------------------------------
		//Ou dessa maneira mauis simplificada
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
