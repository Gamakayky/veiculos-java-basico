package br.com.fiap.fabricaVeiculos;

public class ExecutavelCaminhao {

	public static void main(String[] args) {
		
		Caminhao caminhaoGama = new Caminhao();
		caminhaoGama.marca = "mercedes";
		caminhaoGama.modelo = "benz";
		caminhaoGama.cor = "Preto";
		caminhaoGama.tipoCambio = "Automatico";
		caminhaoGama.tipoCarga = "Soja";
		caminhaoGama.nomeCondutor = "Gama";
		caminhaoGama.renavam = 123456;
		caminhaoGama.motor = "167/55027";
		caminhaoGama.eixo = 8;
		caminhaoGama.aroRoda = 33;
		caminhaoGama.velocidade = 90;
		caminhaoGama.capacidadeCarga = 3000;
		caminhaoGama.cargaAtual = 0;
		
		
		caminhaoGama.ligar();
		caminhaoGama.carregar(1000, "Soja");
		caminhaoGama.acelerar(10);
		
		
		
		
		
		
		
		
		
	}

}
