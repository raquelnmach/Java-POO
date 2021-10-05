package PlanoMedico;

public class Medico extends Plano{
	protected String nome;
	private int crm;

	public Medico(String empresa, String nome, int crm) {
		super(empresa);
		this.nome = nome;
		this.crm = crm;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	@Override
	public String toString() {
		return "Medico [nome=" + nome + ", crm=" + crm + "]" + super.toString();
	}


	@Override
	public double calculaPagamento() {
		return super.valorPago = super.calculaPagamento() * 1.1;
	}
	


}
