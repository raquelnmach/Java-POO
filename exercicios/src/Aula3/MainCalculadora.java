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
		
		System.out.println("Digite o operador para c�lculo: 1 - Soma , 2 - Subtra��o, 3 - Multiplica��o, 4 - Divis�o, 5 - Sair");
		operador = lerOperacao.nextInt();
		
		System.out.println("O resultado do c�lculo �: " + operacao.calcular(valor1, valor2, operador));
		
		lerOperacao.close();	
			
	}
	
	

}
