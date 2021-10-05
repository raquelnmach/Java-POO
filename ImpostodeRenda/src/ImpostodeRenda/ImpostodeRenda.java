package ImpostodeRenda;

public class ImpostodeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;
	
	public ImpostodeRenda(String nome, double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Imposto de Renda: \nNome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email + "\nRendimentos: "
				+ rendimentos ;
	}	
	
	
	
}
