package br.com.fiap.fabricaVeiculos;

import java.util.Date;

public class Caminhao {

	String marca, modelo, cor, motor, tipoCambio, tipoCarga, nomeCondutor;
	Date anoFabricacao = new Date();
	int renavam, velocidade, eixo;
	double aroRoda, qtdCargaSuportada, qtdCargaAbastecida, capacidadeCarga, cargaAtual;
	boolean ligado;

	public void ligar() {
		if (!this.ligado) {
			ligado = true;
			System.out.println("O caminhao esta ligado");
		} else if (!ligado) {
			System.out.println("O caminhao ja esta ligado");
		} else {
			System.out.println("O caminhao precisa estar parado para ser ligado");
		}
	}

	public void desligar() {
		if (ligado && velocidade == 0) {
			ligado = false;
			System.out.println("O caminhao foi desligado");
		} else if (!ligado) {
			System.out.println("O caminhao ja esta desligado");
		} else {
			System.out.println("O caminhao precisa estar parado para ser desligado.");
		}
	}

	public void acelerar(int incremento) {
		if (this.ligado) {
			velocidade += incremento;
			System.out.println("O caminhao acelerou para " + velocidade + "km/h.");
		} else {
			System.out.println("O caminhao precisa estar ligado para acelerar.");
		}
	}

	public void desacelerar(int decremento) {
		if (this.ligado) {
			velocidade -= decremento;
			if (velocidade < 0)
				velocidade = 0;
			System.out.println("O caminhao desacelerou para " + velocidade + "km/h.");
		} else if (!ligado) {
			System.out.println("O caminhao esta desligado.");
		} else {
			System.out.println("O caminhao ja esta parado.");
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

	public void carregar(double quantidade, String tipoCarga) {
		if (cargaAtual + quantidade <= capacidadeCarga) {
			this.cargaAtual += quantidade;
			this.tipoCarga = tipoCarga;
			System.out.println("Caminhao carregado " + quantidade + "kg.");
			if (cargaAtual == 0) {
				tipoCarga = "";
			}
		} else {
			System.out.println("Erro: capacidade de carga excedida! limite maximo e " + capacidadeCarga + "kg");
		}
	}

	public void descarregar(double quantidade) {
		if (cargaAtual >= quantidade) {
			cargaAtual -= quantidade;
			System.out.println("Caminhao descarregado em " + quantidade + "kg.");
			if (cargaAtual == 0) {
				tipoCarga = "";
			}
		} else {
			System.out.println("Erro: nao ha essa quantidade de carga no caminhao para descarregar");
		}
	}

}
