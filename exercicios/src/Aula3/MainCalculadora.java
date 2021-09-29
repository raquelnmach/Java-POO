package Aula3;

import java.util.Scanner;

public class MainCalculadora {

	public static void main(String[] args) {
		Calculadora operacao = new Calculadora();	
		
		Scanner lerOperacao = new Scanner(System.in);
		
		double valor1, valor2;
		int operador;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = lerOperacao.nextDouble();
				
		System.out.println("Digite o segundo valor: ");
		valor2 = lerOperacao.nextDouble();
		
		System.out.println("Digite o operador para cálculo: 1 - Soma , 2 - Subtração, 3 - Multiplicação, 4 - Divisão, 5 - Sair");
		operador = lerOperacao.nextInt();
		
		System.out.println("O resultado do cálculo é: " + operacao.calcular(valor1, valor2, operador));
		
		lerOperacao.close();	
			
	}
	
	

}
