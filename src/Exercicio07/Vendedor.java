package Exercicio07;

public class Vendedor extends Funcionario{

	public Vendedor() {
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return getSalario() + 3000.0;
	}
	
	@Override
	public String toString() {
		return String.format("Vendedor\n bonificacao=%s\n Nome=%s\n Idade=%s\n Salario=%s\n", bonificacao(),
				getNome(), getIdade(), getSalario());
	
}
}
