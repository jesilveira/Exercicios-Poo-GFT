package Exercício040506;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();
		Pessoa joao = new Pessoa("João", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);

		pessoas.add(joao);
		pessoas.add(leandro);
		pessoas.add(paulo);
		pessoas.add(jessica);

		Stream<Pessoa> filtraIdadeMaior = pessoas.stream();

		System.out.println(filtraIdadeMaior.max(Comparator.comparing(i -> i.getIdade())));
		System.out.println("Quantidade de pessoas antes da exclução: " + pessoas);

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i).getIdade() < 18) {
				pessoas.remove(pessoas.get(i));
			}
		}
		System.out.println("Quantidade de pessoas pos exclução: " + pessoas);

		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equalsIgnoreCase("jessica")) {
				System.out.println("A Jessica está na lista: sua idade é " + pessoa.getIdade());
			}
		}
	}

}