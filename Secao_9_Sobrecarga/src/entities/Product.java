package entities;

public class Product {

	public String name;//Atributo
	public double price;//Atributo
	public int quantity;//Atributo
	
	public Product() {
	}//Ainda é possivel fazer um construtor padrão caso queira.
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//Construtor
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}//Construtor e sobrecarga, um mesmo construtor com parametros diferentes.
	//Sobrecarga é disponibilizar mais de uma versão com a diferença de parametros.

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
