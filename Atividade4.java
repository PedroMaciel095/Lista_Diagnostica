package lista_lpa.exemplos;

import java.util.Scanner;

public class Atividade_4{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, soma = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("digite o " + i + "° numero: "); // recolhendo dados
			n = ler.nextInt();
			soma = soma + n; // processamento
		}
		System.out.println("a soma dos números é " + soma); // saída

	}

}
