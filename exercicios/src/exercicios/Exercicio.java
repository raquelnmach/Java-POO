package exercicios;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b;
		
		System.out.println("Informe o primeiro valor:");
		a = ler.nextInt();
		
		System.out.println("Informe o segundo valor:");
		b = ler.nextInt();
		
		System.out.println("\nResultado da Soma:\n");
		System.out.println(a + b);
		
		ler.close();		
	}
		
}
