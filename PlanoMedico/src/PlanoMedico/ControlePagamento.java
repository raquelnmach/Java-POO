package PlanoMedico;

public class ControlePagamento {
	private double totalPago;
	

	public ControlePagamento() {
		super();
	}

	public double getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(double totalPago) {
		this.totalPago = totalPago;
	}
	
	public void calcularTotalPago(Plano plano) {
		this.totalPago += plano.getValorPago();
	}
}
