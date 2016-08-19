package faturas;


public class Fatura {

	private static String numero;
	private static String 	descricao;
	private int quantComprada;
	private static double precoPorItem;
	
	
	public static String getNumero() {
		return numero;
	}
	public static void setNumero(String numero) {
		Fatura.numero = numero;
	}
	public static String getDescricao() {
		return descricao;
	}
	public static void setDescricao(String descricao) {
		Fatura.descricao = descricao;
	}
	public int getQuantComprada() {
		return quantComprada;
	}
	public void setQuantComprada(int quantComprada) {
		this.quantComprada = quantComprada;
	}
	public static double getPrecoPorItem() {
		return precoPorItem;
	}
	public static void setPrecoPorItem(double precoPorItem) {
		Fatura.precoPorItem = precoPorItem;
	}

	
	public double getValorFatura(){
		
		double A=Fatura.precoPorItem*this.quantComprada;
		if (A<0){
			A=0;
		}
		if (precoPorItem<0){
			precoPorItem=0.0;
		}
		return A;
	}


}