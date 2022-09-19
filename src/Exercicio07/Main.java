package Exercicio07;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Joao", 55, 4500.0);
		Supervisor supervisor = new Supervisor("Rosane", 42, 2300.0);
		Vendedor vendedor = new Vendedor("Victor Hugo", 23, 1800.0);
		
		
		System.out.println(gerente); 
		System.out.println(supervisor);
		System.out.println(vendedor);
	}
}
