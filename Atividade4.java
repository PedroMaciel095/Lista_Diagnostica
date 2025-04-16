package lista_lpa.exemplos;

import java.util.Scanner;

public class Atividade_4{

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); //utilizando o Scanner para captar informações
		int n, soma = 0; //declarando variáveis adequadamente

		for (int i = 1; i <= 10; i++) {
			System.out.println("digite o " + i + "° numero: "); // recolhendo dados escritos pelo usuário
			n = ler.nextInt(); //lendo oque foi informado
			soma = soma + n; // processamento (conta)
		}
		System.out.println("a soma dos números é " + soma); // saída de dados para o usuário

	}

}
