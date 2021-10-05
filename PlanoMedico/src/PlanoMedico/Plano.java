package PlanoMedico;

public class Plano {
	protected String empresa;
	protected double valorPago = 80.00;
	protected double valoriss = 0.05;
	
	public Plano(String empresa) {
		super();
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public double getValoriss() {
		return valoriss;
	}

	public void setValoriss(double valoriss) {
		this.valoriss = valoriss;
	}
	
	
	@Override
	public String toString() {
		return "Plano [empresa=" + empresa + ", valorPago=" + valorPago + ", valoriss=" + valoriss + "]";
	}
	
	public double calculaPagamento() {
		return this.valorPago = this.valorPago - (this.valorPago * this.valoriss);
	}
	
	
}
