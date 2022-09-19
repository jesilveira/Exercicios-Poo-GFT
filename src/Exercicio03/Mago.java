package Exercicio03;

import java.util.List;
import java.util.Random;

public class Mago extends Personagens {

	List<String> magia;

	public Mago(String nome, int vida, int mana, int inteligencia, float xp, int forca, int level, List<String> magia) {
		super(nome, vida, mana, inteligencia, xp, forca, level);
		this.magia = magia;
	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	public void attack() {
		Random random = new Random();
		int attack = (getInteligencia() * getLevel()) + (random.nextInt(300) + 0);
		System.out.println("O Mago possui ataque de: " + attack);
	}

	public void aprenderMagia(String magia) {
		getMagia().add(magia);
	}

	@Override
	public void lvlUp() {
		setMana(getMana() + 5);
		setInteligencia(getInteligencia() + 5);
		System.out.println("O Mago aumentou o mana " + getMana() + " e sua inteligencia " + getInteligencia());
	}

	@Override
	public String toString() {
		return String.format(
				"Mago: Magia=%s, Nome=%s,Vida=%s, Mana=%s, Inteligencia=%s, Xp=%s, Forca=%s, Level=%s",
				getMagia(), getNome(), getVida(), getMana(), getInteligencia(), getXp(), getForca(), getLevel());
	}	
}
