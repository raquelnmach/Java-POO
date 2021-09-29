package exercicios;

public class ParesImpares {
	public void somaParImpar() {
		int numPar = 0;
		int numImpar = 0;
		
		for (int i = 0; i < 30; i++) {
			if (i % 2 == 0) {
				numPar += 1;
			} else {
				numImpar += 1;
			}
			System.out.println("A quantidade de números pares de 0 a 30 é:" + numPar);
			System.out.println("A quantidade de números ímpares de 0 a 30 é:" + numImpar);
		}
	}
}
