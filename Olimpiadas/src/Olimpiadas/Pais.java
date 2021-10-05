package Olimpiadas;

public class Pais extends Atleta {
	private String pais;

	public Pais(String nome, double peso, String pais) {
		super(nome, peso);
		this.pais = pais;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return super.toString() + "Pais [pais=" + pais + "]";
	}
	
		
}


