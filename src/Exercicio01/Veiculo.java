package Exercicio01;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustível;
	private int velocidade;
	private double preco;

	
	public Veiculo() {}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustível, int velocidade, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustível = litrosCombustível;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustível() {
		return litrosCombustível;
	}

	public void setLitrosCombustível(int litrosCombustível) {
		this.litrosCombustível = litrosCombustível;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void pintar(String cor) {
		setCor(cor);
	}

	public void acelerar() {
		setVelocidade(getVelocidade() + 20);
		System.out.println("Velocidade atual é: " + getVelocidade() + " KM");
	}

	public void abastecer(int combustivel) {
		if (getLitrosCombustível() < 60) {
			setLitrosCombustível(getLitrosCombustível() + combustivel);
		}
		System.out.println("Tanque de combustivel já está cheio " + getLitrosCombustível());
	}

	public void frear() {
		if (isLigado && getVelocidade() > 0) {
			setVelocidade(getVelocidade() - 20);
			System.out.println("Freando velocidade atualizando: " + getVelocidade());
		} else {
			System.out.println("Veiculo parado: " + getVelocidade());
		}
		
	}
	
	public void ligar() {
		if(!isLigado) {
			setLigado(true);
			System.out.println("Ligando veiculo... ");
		} else {
			System.out.println("Carro ligado.");
		}
	}
	
	public void desligar() {
		if(isLigado && getVelocidade() == 0) {
			setLigado(false);
			System.out.println("Desligando carro..");
		} else {
			System.out.println("Carro está ligado, sua velocidade é: " + getVelocidade());

		}
	}

}
