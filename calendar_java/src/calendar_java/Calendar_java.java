package calendar_java;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendar_java {

	public static void main(String[] args) {
		
		// instanciando SimpleDateFormat
		SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//criando data no formato utc
		Date d = Date.from(Instant.parse("2022-05-25T10:42:07Z"));
		
		System.out.println(date.format(d));
		
//-------------------------------------------------------------------------------------
		// adicionando mais 4 horas com calendar

		//instanciando o Calendar
		Calendar cal = Calendar.getInstance();
		
		//setando a data dentro do Calendar
		cal.setTime(d);
		
		//adicionando 4 horas 
		//posso adionar mais coisas usando esse mesmo codigo. ex: data, hora e etc..
		cal.add(Calendar.HOUR, 4);
		
		// atualizando a variavel d com as 4 horas adiconadas
		d = cal.getTime();
		System.out.println();
		System.out.println("4 horas adicionadas");
		System.out.println(date.format(d));
//-------------------------------------------------------------------------------------
		//pegando os minutos e o mes com Calendar
		
		int min = cal.get(Calendar.MINUTE);
		 
		//tem que adiocnar o 1 pois no Calendar começa com 0, 0 seria janeiro
		int mes = 1 + cal.get(Calendar.MONTH);
		
		System.out.println();
		System.out.println("Pegando os minutos");
		System.out.println(min);
		
		System.out.println();
		System.out.println("Pegando o mes");
		System.out.println(mes);
		
		
	}

}
