package ImpostodeRenda;

public class PessoaJuridica extends ImpostodeRenda {
	private String cnpj;
	private String insEsctadual;
	
	public PessoaJuridica(String nome, double rendimentos, String cnpj, String insEsctadual) {
		super(nome, rendimentos);
		this.cnpj = cnpj;
		this.insEsctadual = insEsctadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInsEsctadual() {
		return insEsctadual;
	}

	public void setInsEsctadual(String insEsctadual) {
		this.insEsctadual = insEsctadual;
	}

	@Override
	public String toString() {
		return "Pessoa Juridica \nCnpj: " + cnpj + "\nInscrição Estadual: " + insEsctadual + super.toString();
	}
	
	public double calculaIR() {
		return this.rendimentos * 0.15;
	}
	
	
}
