package exercicios;

public class TestaFGA {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("Rafael",250);
		Gerente gerente1 = new Gerente("Greg",3000,"Gerência");
		Assistente assistente1 = new Assistente("Jorge",100,1500);
		
		
		System.out.println(funcionario1.toString());
		System.out.println(gerente1.toString());
		System.out.println(assistente1.toString() + "Valor com adicional:" + assistente1.calculaAdicional());
	}

}
