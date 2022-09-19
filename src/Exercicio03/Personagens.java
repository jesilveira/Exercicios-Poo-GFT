package Exercicio03;

public abstract class Personagens {

	private String nome;
	private int vida;
	private int mana;
	private int inteligencia;
	private float xp;
	private int forca;
	private int level;
	private static int qtdPersonagem;
	
	public Personagens() {
		qtdPersonagem ++;
	}
	
	public Personagens(String nome, int vida, int mana, int inteligencia, float xp, int forca, int level) {
		this.nome = nome;
		this.vida = vida;
		this.mana = mana;
		this.inteligencia = inteligencia;
		this.xp = xp;
		this.forca = forca;
		this.level = level;
		qtdPersonagem ++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getMana() {
		return mana;
	}
	public void setMana(int mana) {
		this.mana = mana;
	}
	public int getInteligencia() {
		return mana;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public float getXp() {
		return xp;
	}
	public void setXp(float xp) {
		this.xp = xp;
	}
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	public static int getQtdPersonagem() {
		return qtdPersonagem;
	}
	public abstract void lvlUp();
}



