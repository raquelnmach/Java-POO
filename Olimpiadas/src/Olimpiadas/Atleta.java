package Olimpiadas;

public abstract class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private static String modalidade;
	private static int totalParticipantes;
	public String verificaSituacao;
	
	public Atleta(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public int getTotalParticipantes() {
		return totalParticipantes;
	}

	public void setTotalParticipantes(int totalParticipantes) {
		totalParticipantes++;
	}

	@Override
	public void verificaSituacao(){
		if(this.peso < 60) {
			System.out.println("O atleta não pode participar! Peso Insuficiente!");
		} else if(this.peso >= 60 && this.peso <= 90) {
			System.out.println("O atleta poderá participar! PESO MÉDIO !");
		} else {
			System.out.println("O atleta poderá participar! PESO PESADO! ");
		}
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", peso=" + peso + ", verificaSituacao=" + verificaSituacao + "]";
	}
		
	
}
