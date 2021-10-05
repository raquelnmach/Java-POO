package exercicios;

public class Assistente {
	private String nome;
	private double adicional;
	private double salario;
	
	public Assistente(String nome, double adicional, double salario) {
		super();
		this.adicional = adicional;
		this.nome = nome;
		this.salario = salario;
	}
	
	public double calculaAdicional() {
		this.salario = this.salario + this.adicional;
		return salario;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\n" + "Salário: " + this.salario + "\n" + "Adicional:" + this.adicional + "\n";
	}
	
}
