package Lista_lpa.exemplos;

import java.util.Scanner;

public class If_exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.println("Informe o número : ");
		numero = ler.nextInt(); // Entrada de dados

		if (numero > 10) { // Estrutura de decisão
			System.out.println("o numero é maior ou igual que 10");
		} else {
			System.out.println("o numeo é menor que 10");

		}

	}

}
