package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	// composi�ao com a classe Product
	private Product product;

//========================================================
//construct

	public OrderItem() {

	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

//========================================================
//getters e setters

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

//========================================================
//metodos	

	public double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return getProduct().getName() 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", Quantity: " 
				+ quantity 
				+ ", Subtotal: $" 
				+ String.format("%.2f", subTotal()) ;
	}

}
