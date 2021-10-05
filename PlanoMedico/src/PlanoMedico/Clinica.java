package PlanoMedico;

public class Clinica extends Plano{
	private String nome;
	private String cgc;
	
	public Clinica(String empresa, String nome, String cgc) {
		super(empresa);
		this.nome = nome;
		this.cgc = cgc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCgc() {
		return cgc;
	}

	public void setCgc(String cgc) {
		this.cgc = cgc;
	}

	@Override
	public String toString() {
		return "Clinica [nome=" + nome + ", cgc=" + cgc + "]" + super.toString();
	}
	
	
	
}
