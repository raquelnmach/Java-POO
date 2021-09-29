package exercicios;

public class Empregado {
	private String nome;
	private String sobrenome;
	private double salario;
	
	public Empregado(String nome, String sobrenome, double salario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salario = salario;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double calculaImpostodeRenda() {
		double salario = 0;
		
		if(this.salario < 1903.98){
			salario = this.salario;
		}else if (this.salario >= 1903.98 && this.salario < 2826.65) {
            salario = this.salario - (this.salario * 0.075 );
        }else if(this.salario >= 2826.65 && this.salario < 3751.05) {
            salario = this.salario - (this.salario * 0.15);
        }else if (this.salario >= 3751.05 && this.salario < 4664.68) {
            salario = this.salario - (this.salario * 0.225);
        }else if (this.salario > 4664.68) {
            salario = this.salario - (this.salario * 0.275);
        }
        return salario;
    }
	
	public void mostraEmpregado() {
		System.out.println("N�mero do Empregado: " + getNome());
        System.out.println("Sobrenome: " + getSobrenome());
        System.out.println("Sal�rio sem desconto: " + getSalario());
        System.out.println("Sal�rio com desconto: " + calculaImpostodeRenda() + "\n");
	}
	
}
