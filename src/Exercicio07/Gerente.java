package Exercicio07;

public class Gerente extends Funcionario {

	
	public Gerente() {
		
	}

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return getSalario() + 10000.0;
	}

	@Override
	public String toString() {
		return String.format("Gerente\n bonificacao=%s\n Nome=%s\n Idade=%s\n Salario=%s\n", bonificacao(),
				getNome(), getIdade(), getSalario());
	}
	
	
}
