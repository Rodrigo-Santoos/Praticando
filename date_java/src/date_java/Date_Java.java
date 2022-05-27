package date_java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Java {

	public static void main(String[] args) throws ParseException {
		
		// instanciando SimpleDateFormat
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// criando a variavel com a data de agora
		Date x1 = new Date();
		
		// outra maneira de pega a data atual
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("Data atual x1: " + x1);
		System.out.println("Data atual x1: " + sdf2.format(x1));
		System.out.println();
		
		System.out.println("Data atual x2: " + x2);
		System.out.println("Data atual x2: " + sdf2.format(x2));
		System.out.println();
		
		Date y1 = sdf1.parse("27/05/2022");
		Date y2 = sdf2.parse("27/05/2022 15:08:00");
		
		// formato padrao no java
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println();
		
		// formatdando como para dd/MM/yyyy HH:mm:ss
		System.out.println("y1 : " + sdf1.format(y1));
		System.out.println("y2 : " + sdf2.format(y2));
		System.out.println();
	}

}
