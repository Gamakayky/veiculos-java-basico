package br.com.fiap.fabricaVeiculos;

public class Executavel {

	public static void main(String[] args) {

		Carro carroKayky = new Carro();
		carroKayky.marca = "Volkswagen";
		carroKayky.modelo = "Uno";
		carroKayky.cor = "preto";
		carroKayky.renavam = 12345;
		carroKayky.motor = "163/5500";
		carroKayky.nomeCondutor = "Kayky Gama";
		carroKayky.aroRoda = 18;
		carroKayky.tipoCambio = "Manual";
		carroKayky.ligado = true;
		carroKayky.velocidade = 50;

		carroKayky.ligar();
		carroKayky.acelerar(100);
		carroKayky.desacelerar(150);
		carroKayky.desligar();
		carroKayky.exibirDados();
	}

}
