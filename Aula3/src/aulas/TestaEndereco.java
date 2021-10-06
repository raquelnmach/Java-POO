package aulas;

public class TestaEndereco {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Rua Alberto Torres 192","Centro","Petr�polis");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("13008992714");
		funcionario.setNome("Ana");
		funcionario.setEndereco(endereco);
		
		System.out.println(funcionario.toString() + funcionario.getEndereco().getRua() + " " + funcionario.getEndereco().getBairro());

	}

}
