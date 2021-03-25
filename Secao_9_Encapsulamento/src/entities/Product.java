package entities;

public class Product {

	private String name;//Atributo, private serve para dizer que esse atributo não podem ser acessados por outras classes.
	private double price;//Atributo, private serve para dizer que esse atributo não podem ser acessados por outras classes.
	private int quantity;//Atributo, private serve para dizer que esse atributo não podem ser acessados por outras classes.
	
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
	
	//getName em CamelCase o metodo para acessar o atributo name é do metodo String o getName para obter esse nome vai ter que retornar String.
	//pode ter uma pequena lógica mas a função mesmo é retornar um atributo.
	public String getName() {
		return name;
	}
	
	//setName é para alterar o valor do atributo, que no caso é o name, ele é void porque ele não precisa me retornar nada, void = vazio.
	//Também pode possuir alguma lógica se necessario.
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	//Não tem o setQuantity pois não precisa de alteração na quantidade, com isso protegendo o produto
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
