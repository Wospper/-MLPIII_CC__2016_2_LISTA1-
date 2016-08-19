package br.unipe;
import java.util.Scanner;

public class MainFerrari {
	public static void main(String[] args) {

		ScudariaFerrari Carro = new ScudariaFerrari();

		Scanner leitor = new Scanner(System.in);
		int opcao = 0;
		while (opcao != 2) {
			System.out.println("Digite 1 para fazer uma carro um 2 para cancelar: ");
			opcao = leitor.nextInt();
			switch (opcao) {
			case 1: {
				System.out.println("Digite a cor do carro: ");
				Carro.setCor(leitor.nextLine());
				leitor.nextLine();
				System.out.println("Digite o modelo do carro: ");
				Carro.setModelo(leitor.nextLine());
				System.out.println("Digite a velocidade maxima: ");
				Carro.setVelocidadeMaxima(leitor.nextInt());
				while (Carro.getVelocidadeAtual() != 0) {
					System.out.println("Digite a velocidade atual(para sair do loop digite 0): ");
					Carro.setVelocidadeAtual(leitor.nextInt());
					Carro.acelerar();
				}
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
		leitor.reset();
		leitor.close();
	}
}
