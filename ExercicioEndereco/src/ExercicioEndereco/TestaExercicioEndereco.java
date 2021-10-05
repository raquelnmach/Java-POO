package ExercicioEndereco;

public class TestaExercicioEndereco {
	public static void main(String[] args) {
		
		Estado e1 = new Estado("São Paulo", "SP");
		Estado e2 = new Estado("Rio de Janeiro", "RJ");
		
		Cidade cid1 = new Cidade("Taubaté", e1);
		Cidade cid2 = new Cidade("Taubaté", e2);
		
		Endereco end1 = new Endereco("7 de Setembro", "Mooca" , "24568-11", cid1 );
		Endereco end2 = new Endereco("Delfim Moreira", "Várzea", "25953-130", cid2 );
		
		Contato c1 = new Contato("José da Sileira", end1);
		Contato c2 = new Contato("Maria Joana", end2);
		
		Telefone[] t = new Telefone[2];
		
		t[0] = new Telefone("(11)96472-5400");
		t[1] = new Telefone("(11)3562-4875");

		c1.setTelefone(t);
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}
}
