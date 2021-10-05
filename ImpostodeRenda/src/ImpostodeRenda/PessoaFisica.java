package ImpostodeRenda;

public class PessoaFisica extends ImpostodeRenda {
	private String cpf;
	private String rg;
	
	public PessoaFisica(String nome, double rendimentos, String cpf, String rg) {
		super(nome, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "PessoaFisica: \nCPF: " + cpf + "\nRG: " + rg + "\n"+ super.toString();
	}
	
	public double calculaIR() {
		return this.rendimentos * 0.12;
	}
	
}
