package aulas;

public class Funcionario {
	private String cpf;
	private String nome;
	private Endereco endereco;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	@Override
	public String toString() {
		return "cpf: " + cpf + "Nome: " + nome + "Endereço: " + endereco;
	}
	

}
