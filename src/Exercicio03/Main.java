package Exercicio03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		Mago mago =  new Mago("Victor", 100, 150, 500, 800, 700, 3, new ArrayList<>(Arrays.asList("feitiço")));

		Guerreiro guerreiro = new Guerreiro("Joao", 250, 650, 1500, 800, 900,3, new ArrayList<>(Arrays.asList("feitiço")));
		System.out.println("==================================================================================");

		System.out.println("Quantidade de personagens atual é: " + Personagens.getQtdPersonagem());
		System.out.println("==================================================================================");
		
		mago.aprenderMagia("bola de fogo");
		mago.attack();
		mago.lvlUp();
		
		System.out.println(mago);
		mago.lvlUp();
		System.out.println("\n"+mago);
		
		System.out.println("==================================================================================");
		
		guerreiro.aprenderMagia("Arco e flexa");
		guerreiro.lvlUp();
		guerreiro.attack();
		System.out.println("\n"+guerreiro);
		System.out.println("==================================================================================");

	}

}
