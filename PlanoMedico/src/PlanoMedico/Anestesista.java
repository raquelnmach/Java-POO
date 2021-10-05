package PlanoMedico;

public class Anestesista extends Medico {
	private String tipoAnestesista;


	public Anestesista(String empresa, String nome, int crm, String tipoAnestesista) {
		super(empresa, nome, crm);
		this.tipoAnestesista = tipoAnestesista;
	}

	public String getAnestesista() {
		return tipoAnestesista;
	}

	public void setAnestesista(String anestesista) {
		tipoAnestesista = anestesista;
	}

	@Override
	public String toString() {
		return "Anestesista [Anestesista=" + tipoAnestesista + "]" + super.toString();
	}

	@Override
	public double calculaPagamento() {
		return super.valorPago = super.calculaPagamento() + 1000;
	}
	

	
}
