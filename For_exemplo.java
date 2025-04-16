package Lista_lpa.exemplos;

import java.util.Scanner;

public class For_exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;

		System.out.println("Informe o número da tabuada:");
		n = ler.nextInt();

		for (int i = 1; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);

		}
	           ler.close();
	}
	
}
