package Lista_lpa.exemplos;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) { //inicializando a main
		Scanner ler = new Scanner(System.in);
		// Utilizando a biblioteca "Scanner" para captar oque o usuário irá escrever com a variavel "Ler"

		int n1, n2, result; // Declarando as variáveis adequadamente

		System.out.println("Informe o primeiro número: "); // Aparece o texto devido na tela do usuário
		n1 = ler.nextInt(); // Entrada de dados (captando oque o usuário digitou()numero 1)

		System.out.println("Informe o segundo número: ");// Aparece o texto devido na tela do usuário
		n2 = ler.nextInt(); // Entrada de dados (captando oque o usuário digitou)(numero 2)

		result = n1 + n2; // Processamento (soma dos n)

		System.out.println("O resultado da operção é: " + result); // Saída

	}

}
