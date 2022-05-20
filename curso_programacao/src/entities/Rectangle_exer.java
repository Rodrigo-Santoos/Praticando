package entities;

public class Rectangle_exer {
	
	public double width;
	public double height;
	
	public double area(){
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double peri = (width + width) + (height + height);
		return peri;
	}
	
	public double diagonal() {
		double dob = (Math.pow(width, 2) + Math.pow(height, 2));
		double dia = Math.sqrt(dob);
		return dia;
	}

}
