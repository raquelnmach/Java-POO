package ImpostodeRenda;

public class TestaIr {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica("Joao da Silva", 750.50, "799822455-12", "48256-7");
		
		PessoaJuridica pj = new PessoaJuridica("Maria das Dores", 1250.00 , "133255488-47","256489-1");
		
		System.out.println("--------Dados Pessoa F�sica--------");
		System.out.println(pf.toString());
		System.out.println("O valor a pagar de IR � de: " + pf.calculaIR());
		System.out.println("--------Dados Pessoa Jur�dica--------");
		System.out.println(pj.toString());
		System.out.println("O valor a pagar de IR � de: " + pj.calculaIR());
	}

}
