package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//==========================================================================
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = entrada.nextLine();
		System.out.print("Email: ");
		String email = entrada.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(entrada.next());
		
		Client client = new Client(name, email, birthDate);
		
//==========================================================================	
		System.out.println("Enter order data:");
		System.out.print("Status [PENDING_PAYMENT | PROCESSING | SHIPED | DELIVERED] :");
		
		//convertendo string para o valor enunciado no OrderStatus
		OrderStatus status = OrderStatus.valueOf(entrada.next());
		
		//instaciando o Order 
		Order order = new Order(new Date(), status, client);
		
//==========================================================================
		
		System.out.print("How many items to this order? ");
		int N = entrada.nextInt();
		
		for (int i=1; i<=N; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			entrada.nextLine();
			String productName = entrada.nextLine();
			System.out.print("Product price: ");
			double productPrice = entrada.nextDouble();
			System.out.print("Quantity: ");
			int quantity = entrada.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);			
		}

//==========================================================================
		
		System.out.println();
		System.out.println(order);
		
		entrada.close();

	}

}
