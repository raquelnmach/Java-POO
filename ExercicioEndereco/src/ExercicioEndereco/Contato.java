package ExercicioEndereco;

import java.util.Arrays;

public class Contato {
	private String nome;
	private Endereco endereco;
	private Telefone[] telefone;

	public Contato(String nome, Endereco endereco) {
		super();
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public Telefone[] getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone[] telefone) {
		this.telefone = telefone;
	}

	public void mostrarTelefones() {
		for (int i = 0; i < telefone.length; i++) {
			System.out.println("Telefone(s): " + telefone[i]);
		}
	}

	@Override
	public String toString() {
		return "\n------------Contato:------------- " 
				+ "\n" + "Nome: " + nome + "\nEndereço: " + endereco 
				+ "\nTelefones: " + Arrays.toString(telefone);
	}

	
}	

