import java.util.Scanner;

public class Funcao_Java01 {

	public static void main(String[] args) {

		Scanner entrada= new Scanner (System.in);
		
		int a, b, c;
		
		System.out.println("Digite 3 numeros inteiros!");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		
		int h = max(a,b,c);
		
		mostrar(h);
		
		entrada.close();
	}
	//retorno do valor maior na funçao
	public static int max(int x, int y, int z) {
		int au ;
		if(x > y && x > z) {
			au = x;
		}else if(y > z) {
			au = y;
		}else {
			au = z;
		}
		return au;
	}
	//printando o valor maior
	public static void mostrar(int a) {
		System.out.println("O maior é: "+ a);
	}

}
