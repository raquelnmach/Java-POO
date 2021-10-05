package FuncionarioGerente;

public class Gerente {
	private String nome;
	private double salario;
	private String nivel;
	
	public Gerente(String nome, Double salario, String nivel) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = this.salario + 200.00;
	}

	@Override
	public String toString() {
		return "Gerente [nome=" + nome + ", salario=" + salario + ", nivel=" + nivel + "]";
	}

	public double calculaParticipacaoGerente() {	
		this.salario += 200;	
		return salario;}
	}