package faturas;

import java.util.Scanner;

public class MainFatura {
	public static void main(String[] args) {

		Fatura Loja = new Fatura();

		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 2) {
			System.out.println("Digite 1 para fazer uma faura ou 2 para cancelar: ");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Digite o numero da fatura: ");
				Fatura.setNumero(leitor.nextLine());
				leitor.nextLine();
				System.out.println("Digite a descriçao da fatura: ");
				Fatura.setDescricao(leitor.nextLine());
				System.out.println("Digite o preço por item da fatura: ");
				Fatura.setPrecoPorItem(leitor.nextDouble());
				System.out.println("Digite a quantidade comprada da fatura: ");
				Loja.setQuantComprada(leitor.nextInt());
				
				System.out.println("--------------------------");
				System.out.println("Numero: " + Fatura.getNumero());
				System.out.println("Descriçao: " + Fatura.getDescricao());
				System.out.println("Valor da fatura: " + Loja.getValorFatura());
				System.out.println("--------------------------");
				
				break;
			}
			case 2:
				break;

			default: {
				opcao = 0;
				System.out.println("Opçao errada!");
				break;
			}

			}

		}

	}
}
