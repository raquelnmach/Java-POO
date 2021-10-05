package FuncionarioGerente;

public class Assistente {
	private String nome;
	private double salario;
	private double adicional;
	
	public Assistente(String nome, double salario, double adicional) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.adicional = adicional;
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
		this.salario = this.salario + this.adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public String toString() {
		return "Assistente [nome=" + nome + ", salario=" + salario + ", adicional=" + adicional + "]";
	}

	public double calculaAdicional() {
		this.salario = this.salario + this.adicional;
		return salario;
	}
}
