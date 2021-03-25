package entities;

public class Product {

	private String name;//Atributo, private serve para dizer que esse atributo n�o podem ser acessados por outras classes.
	private double price;//Atributo, private serve para dizer que esse atributo n�o podem ser acessados por outras classes.
	private int quantity;//Atributo, private serve para dizer que esse atributo n�o podem ser acessados por outras classes.
	
	public Product() {
	}//Ainda � possivel fazer um construtor padr�o caso queira.
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}//Construtor
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}//Construtor e sobrecarga, um mesmo construtor com parametros diferentes.
	//Sobrecarga � disponibilizar mais de uma vers�o com a diferen�a de parametros.
	
	//getName em CamelCase o metodo para acessar o atributo name � do metodo String o getName para obter esse nome vai ter que retornar String.
	//pode ter uma pequena l�gica mas a fun��o mesmo � retornar um atributo.
	public String getName() {
		return name;
	}
	
	//setName � para alterar o valor do atributo, que no caso � o name, ele � void porque ele n�o precisa me retornar nada, void = vazio.
	//Tamb�m pode possuir alguma l�gica se necessario.
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	//N�o tem o setQuantity pois n�o precisa de altera��o na quantidade, com isso protegendo o produto
	public int getQuantity() {
		return quantity;
	}
	
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
