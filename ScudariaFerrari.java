package br.unipe;

public class ScudariaFerrari {
	 private String cor, modelo;
	 private int velocidadeAtual=1, velocidadeMaxima=1;

	public void ligar() {
	}

	public void acelerar() {
		if (this.velocidadeAtual > this.velocidadeMaxima)
			System.out.println("Velocidade para o carro designado foi execida!");
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

}
