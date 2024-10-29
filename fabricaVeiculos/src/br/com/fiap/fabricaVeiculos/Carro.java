package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Carro {

	String marca;
	String cor;
	Date anoFabricacao = new Date();
	String modelo;
	int renavam;
	String motor;
	String tipoCambio;
	double aroRoda;
	double velocidade;
	String nomeCondutor;
	boolean ligado;

	public void ligar() {
		if (!this.ligado) {
			ligado = true;
			System.out.println("O carro esta ligado");
		} else if (!ligado) {
			System.out.println("O carro ja estaa ligado");
		} else {
			System.out.println("O carro precisa estar parado para ser desligado");
		}
	}

	public void desligar() {
		if (ligado && velocidade == 0) {
			ligado = false;
			System.out.println("O carro foi desligado");
		} else if (!ligado) {
			System.out.println("O carro ja esta desligado");
		} else {
			System.out.println("O carro precisa estar parado para ser desligado.");
		}
	}

	public void acelerar(int incremento) {
		if (this.ligado) {
			velocidade += incremento;
			System.out.println("O carro acelerou para " + velocidade + "km/h.");
		} else {
			System.out.println("O carro precisa estar ligado para acelerar.");
		}
	}

	public void desacelerar(int decremento) {
		if (this.ligado) {
			velocidade -= decremento;
			if (velocidade < 0)
				velocidade = 0;
			System.out.println("O carro desacelerou para " + velocidade + "km/h.");
		} else if (!ligado) {
			System.out.println("O carro esta desligado.");
		} else {
			System.out.println("O carro ja esta parado.");
		}
	}

	public void exibirDados() {
		System.out.println("Marca " + marca);
		System.out.println("Cor " + cor);
		System.out.println("Ano de fabricacao " + anoFabricacao);
		System.out.println("Modelo do carro " + modelo);
		System.out.println("Renavam " + renavam);
		System.out.println("Motor " + motor);
		System.out.println("Tipo de cambio " + tipoCambio);
		System.out.println("Aro das rodas " + aroRoda);
		System.out.println("Nome do condutor " + nomeCondutor);
		System.out.println("Velocidade atual " + velocidade + "km/h");
		System.out.println("Status: " + (ligado ? "Ligado" : "Desligado"));
	}

}
