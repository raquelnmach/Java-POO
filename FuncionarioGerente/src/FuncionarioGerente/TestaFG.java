package FuncionarioGerente;

public class TestaFG {

	public static void main(String[] args) {
		
		Funcionario f = new Funcionario("Jo�o", "125456789-14", 550.50, "Manh�");
		Gerente g = new Gerente("Greg", 1.500, "Ger�ncia");
		Assistente a = new Assistente("Jorge", 250, 30);
		
		f.calculaParticipacaoFuncionario();
		g.calculaParticipacaoGerente();
		a.calculaAdicional();
		
		System.out.println(f.toString());
		System.out.println(g.toString());
		System.out.println(a.toString());

	}

}
