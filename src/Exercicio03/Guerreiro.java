package Exercicio03;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagens {

	List<String> habilidade;

	public Guerreiro(String nome, int vida, int mana, int inteligencia, float xp, int forca, int level,
			List<String> habilidade) {
		super(nome, vida, mana, inteligencia, xp, forca, level);
		this.habilidade = habilidade;
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}

	public void aprenderMagia(String magia) {
		getHabilidade().add(magia);
	}

	public void attack() {
		Random random = new Random();
		int attack = (this.getForca() * this.getLevel()) + (random.nextInt(300) + 0);
		System.out.println("O guerreiro tem um ataque de " + attack);
	}

	@Override
	public void lvlUp() {
		setForca(getForca() + 5);
		setVida(getVida() + 10);
		System.out.println("O guerreiro aumentou sua força " + getForca() + " e sua vida " + getVida());
	}

	@Override
	public String toString() {
		return String.format(
				"Guerreiro [Habilidade=%s, Nome=%s, Vida=%s, Mana=%s, Inteligencia=%s, Xp=%s, Forca=%s, Level=%s]",
				getHabilidade(), getNome(), getVida(), getMana(), getInteligencia(), getXp(), getForca(), getLevel());
	}

	
}
