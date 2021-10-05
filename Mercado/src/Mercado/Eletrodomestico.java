package Mercado;

public class Eletrodomestico extends Produto {
	private int voltagem;
	public static double valorTotal = 0;

	public Eletrodomestico(String nome, double valor, int voltagem) {
		super(nome, valor);
		this.voltagem = voltagem;
	}

	public int getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public double vender(int quantidadeDeItens) {
		valorTotal = quantidadeDeItens * super.getValor();
		return valorTotal;
	}

	@Override
	public String toString() {
		return super.toString() + "Eletrodoméstico com Voltagem: " + voltagem + "v" + " | ";
	}
	
	
}
