package aplication;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Aplication {

	public static void main(String[] args) {

		Order or = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

		// imprimindo no formato string
		System.out.println(or);
		System.out.println();
		
		System.out.println(or.getClass());

		// convertendo String para enum
		OrderStatus os1 = OrderStatus.DEVILERED;
		OrderStatus os2 = OrderStatus.valueOf("PROCESSIG");

		System.out.println(os1);
		System.out.println(os2);
		System.out.println();

		// verificando o tipo da variavel
		System.out.println(os1.getClass());
		System.out.println(os2.getClass());

	}

}
