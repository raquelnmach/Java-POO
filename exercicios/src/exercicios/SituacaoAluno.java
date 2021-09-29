package exercicios;

public class SituacaoAluno {
	
	public void calculaMedia() {
	
		double nota1 = 6, nota2 = 8;
		double media = (nota1 + nota2)/2;
	
		if (media == 10) {
			System.out.println("Parabéns! Aprovado!");
		} else if (media >= 7){
			System.out.println("Aprovado!");
		} else if (media < 7) {
			System.out.println("Reprovado");
		}
	}
}


