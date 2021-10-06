package aulas;

public class Medico {
	private int crm;
	private String nome;
	private double salario;
    private double valorConsulta;
    public static int totalMedicos = 0;
    
	public Medico() {
		totalMedicos += 1;
    }
    
	public Medico(int crm, String nome, double salario, double valorConsulta) {
		this();
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
	}
	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
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
		this.salario = salario;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

   
    public void pagamentoDinheiro(double valorConsulta) {
    	this.salario += this.valorConsulta;
    }
    
    public void pagamentoPlano(double valorConsulta) {
    	this.salario += this.valorConsulta * 0.7;
    }

}
