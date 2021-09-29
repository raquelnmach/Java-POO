package Aula3;

public class Calculadora {
	double resultado;
	
	public double calcular (double a, double b, int operacao) {
		
		switch (operacao) {
		case 1:
			resultado = a + b;
		case 2:
			resultado = a - b;
		case 3:
			resultado = a * b;
		case 4:
			resultado = a / b;
		case 5:
			break;
		}

		return resultado;

	}
	
}
