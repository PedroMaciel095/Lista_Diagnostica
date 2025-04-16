package Lista_lpa.exemplos;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) { //inicializando a main
		Scanner ler = new Scanner(System.in);
		// Utilizando a biblioteca "Scanner" para captar oque o usuário irá escrever com a variavel "Ler"
		
		int b, h, area; //Declarando as variáveis adequadamente

		System.out.println("Informe a medida da base do seu triângulo: "); // Aparece o texto devido na tela do usuário
		b = ler.nextInt(); // Entrada de dados (captando oque o usuário digitou) (base)

		System.out.println("Informe a altura do seu triângulo: "); // Aparece o texto devido na tela do usuário
		h = ler.nextInt(); // Entrada de dados (captando oque o usuário digitou)(altura)

		area = b * h / 2; //Processamento (Formula da area de um triângulo equilátero)

		System.out.println("A área de seu triângulo é :" + area); // Aparece o texto devido na tela do usuário (e mostra o resultado)(area total do triângulo
	}

}
