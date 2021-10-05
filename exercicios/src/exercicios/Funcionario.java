package exercicios;

public class Funcionario {
	protected String nome;
	protected int cpf;
	protected double salario;
	protected String turno;
	
	public Funcionario(String nome, double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Salário Bruto: " + this.salario + "\n" + "Salário com Participação: " + calculaParticipacaoFuncionario() + "\n";
	}
	
	public double calculaParticipacaoFuncionario() {
		this.salario *= 1.01;
		return salario;
	}
}
