package exercicios;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Resultado exerc�cio M�dia Alunos: \n");
		SituacaoAluno situacao = new SituacaoAluno();
		situacao.calculaMedia();
		
		System.out.println("Resultado exerc�cio Calculo INSS: \n");
		CalculadoraSalario desconto = new CalculadoraSalario();
		desconto.CalculaDesconto();

		System.out.println("Resultado exerc�cio Calculo N�meros Pares e �mpares: \n");
		ParesImpares parimpar = new ParesImpares();
		parimpar.somaParImpar();		
	}

}
