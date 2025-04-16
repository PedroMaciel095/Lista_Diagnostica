package Lista_lpa.exemplos;

import java.util.Scanner;

public class Double_exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double a, b, soma;

		System.out.println("Informe o valor 1: ");
		a = ler.nextDouble();

		System.out.println("Informe o valor 2: ");
		b = ler.nextDouble(); //Entrada

		soma = a + b;  // Processsamento

		System.out.println("O resultado é: " + soma);
		ler.close();  //Saida
	}

}
