package Exercicio07;

public class Supervisor extends Funcionario {

	public Supervisor() {
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
	}

	@Override
	public double bonificacao() {
		return getSalario() + 5000.0;
	}
	
	@Override
	public String toString() {
		return String.format("Supervisor\n bonificacao=%s\n Nome=%s\n Idade=%s\n Salario=%s\n", bonificacao(),
				getNome(), getIdade(), getSalario());
}
}
