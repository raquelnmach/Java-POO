package exercicios;

public class Gerente {
	private String nome;
	private double salario;
	private String nivel;
		
	public Gerente(String nome, double salario, String nivel) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.nivel = nivel;
	}
	
	public double calculaParticipacaoGerente() {
		this.salario += 200;
		return salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Salário: " + this.salario + "\n";
	}
	
}
