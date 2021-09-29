package exercicios;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("Resultado exercício Média Alunos: \n");
		SituacaoAluno situacao = new SituacaoAluno();
		situacao.calculaMedia();
		
		System.out.println("Resultado exercício Calculo INSS: \n");
		CalculadoraSalario desconto = new CalculadoraSalario();
		desconto.CalculaDesconto();

		System.out.println("Resultado exercício Calculo Números Pares e Ímpares: \n");
		ParesImpares parimpar = new ParesImpares();
		parimpar.somaParImpar();		
	}

}
