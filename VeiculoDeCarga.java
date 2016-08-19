package veiculos;

public class VeiculoDeCarga {

	private String placa;
	private String marca;
	private String modelo; 
	private String chassi;
	private double ano;
	private double valorKmRodado;
	private double KmInicial;
	private double kmFinal;
	private double valorDaLocacao;
	private double capacidadeDeCarga;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
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
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public double getAno() {
		return ano;
	}
	public void setAno(double ano) {
		this.ano = ano;
	}
	public double getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(double valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public double getKmInicial() {
		return KmInicial;
	}
	public void setKmInicial(double kmInicial) {
		KmInicial = kmInicial;
	}
	public double getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(double kmFinal) {
		this.kmFinal = kmFinal;
	}
	public double getValorDaLocacao() {
		return valorDaLocacao;
	}
	public void setValorDaLocacao(double valorDaLocacao) {
		this.valorDaLocacao = valorDaLocacao;
	}
	public double getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}
	public void setCapacidadeDeCarga(double capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}
	
}
