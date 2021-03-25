package entities;

public class Product {

	public String name;//Atributo
	public double price;//Atributo
	public int quantity;//Atributo
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//Construtor

	public double totalValueInStock() {
		return price * quantity;
	}//Metodo

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}//Metodo

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}//Metodo

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}//Metodo

}
