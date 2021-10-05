package Mercado;

public class BebidaAlcoolica extends Produto {
	private double teorAlcoolico;
	public static double valorTotal = 0;

	public BebidaAlcoolica(String nome, double valor, double teorAlcoolico) {
		super(nome, valor);
		this.teorAlcoolico = teorAlcoolico;
	}

	
	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}


	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}


	@Override
	public double vender(int quantidadeDeItens) {
		valorTotal = quantidadeDeItens * super.getValor();
		return valorTotal;
	}


	@Override
	public String toString() {
		return super.toString() + "Bebida Alcoolica com Teor Alcoolico: " + teorAlcoolico + "%" + " | ";
	}
	
	

}
