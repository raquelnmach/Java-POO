package FuncionarioGerente;

public class Funcionario {
	protected String nome;
	protected String cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, String cpf, double salario, String turno) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.turno = turno;
	}
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public double getSalario() {
		return salario = salario * 0.1;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", salario=" + salario + "]";
	}

	public double calculaParticipacaoFuncionario() {
		this.salario *= 1.01;
		return salario;
	}
	
}
