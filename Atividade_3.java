package Lista_lpa.exemplos;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) { //inicializando a main
		Scanner ler = new Scanner(System.in); // Utilizando a biblioteca "Scanner" para captar oque o usuário irá escrever com a variavel "Ler"
		int dia; //Declarando as variáveis adequadamente

		System.out.println("Informe o dia da semana : "); // Aparece o texto devido na tela do usuário
		dia = ler.nextInt(); // Entrada de dados (captando oque o usuário digitou) (DIA DESEJADO)

		if (dia == 1) { //Se o valor da variavel dia for "1" , mostra-rá ...
			System.out.println("Domingo"); //mostra-rá "Domingo"
		} else if (dia == 2) { //Se o valor da variavel dia for "2" , mostra-rá ...
			System.out.println("Segunda"); //mostra-rá "Segunda"
		} else if (dia == 3) {//Se o valor da variavel dia for "3" , mostra-rá ...
			System.out.println("Terça"); //mostra-rá "Terça"
		} else if (dia == 4) {//Se o valor da variavel dia for "4" , mostra-rá ...
			System.out.println("Quarta"); //mostra-rá "Quarta"
		} else if (dia == 5) {//Se o valor da variavel dia for "5" , mostra-rá ...
			System.out.println("Quinta"); //mostra-rá "Quinta"
		} else if (dia == 6) {//Se o valor da variavel dia for "6" , mostra-rá ...
			System.out.println("Sexta"); //mostra-rá "Sexta"
		} else if (dia == 7) {//Se o valor da variavel dia for "7" , mostra-rá ...
			System.out.println("Sabádo"); //mostra-rá "Sabádo"
		} else { //Se não , mostra-rá ...
			System.out.println("Número da semana inválido ou inexistente"); //mostra-rá "Dia da semana inválido ou inexistente"

		}
	}
}
