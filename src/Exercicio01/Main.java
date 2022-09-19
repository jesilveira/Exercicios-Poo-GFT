package Exercicio01;

public class Main {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo("fiat", "FastBack", "IBG9345", "verde", 10500, true, 55, 20, 120.00);
		
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.abastecer(5);
		veiculo.abastecer(1);
		veiculo.frear();
		veiculo.frear();
		veiculo.frear();
		veiculo.desligar();
		veiculo.ligar();
		veiculo.acelerar();
		veiculo.acelerar();
		veiculo.desligar();

	}

}
