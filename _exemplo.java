package Lista_lpa.exemplos;

import java.util.Scanner;

public class _exemplo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Informe uma nota para o atendente : "); //Entrada
		int nota = ler.nextInt();

		if (nota >= 10) {                     //Processamento
			System.out.println("Ótimo");      //Saída

		} else if (nota >= 5) {
			System.out.println("Bom");        //*
		} else {
			System.out.println("Regular");    //*
		}

	}
}