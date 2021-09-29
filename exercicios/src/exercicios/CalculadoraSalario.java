package exercicios;

public class CalculadoraSalario {

	public void CalculaDesconto() {
		
		double salario = 6.000;
		double salarioDesc;
		
		if (salario <= 1751.81) {
			salarioDesc = salario - (salario * 0.08);
			System.out.println("O desconto será de 8%: " + salarioDesc);
		} else if (salario <= 1751.82 && salario <= 2919.72) {
			salarioDesc = salario - (salario * 0.09);
			System.out.println("O desconto será de 9%: " + salarioDesc);
		} else if (salario <= 2919.73 && salario <= 5839.45) {
			salarioDesc = salario - (salario * 0.1);
			System.out.println("O desconto será de 8%: " + salarioDesc);
		} else {
			salarioDesc = salario - (salario * 0.11);
			System.out.println("O desconto será de 11%: " + salarioDesc);
				
	    }
	}
}
