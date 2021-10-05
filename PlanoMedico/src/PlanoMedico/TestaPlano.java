package PlanoMedico;

public class TestaPlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("ERT", "Clinica Geral", "CGC");
		Medico m = new Medico("Amil", "Jose da Mata", 4575315);
		Anestesista a = new Anestesista("ERT", "Rafael Correa", 36859211, "RAC");
		ControlePagamento cp = new ControlePagamento();
		
		
		c.calculaPagamento();
		System.out.println(c.toString());
		
		m.calculaPagamento();
		System.out.println(m.toString());
		
		a.calculaPagamento();
		System.out.println(a.toString());
		
		cp.calcularTotalPago(a);
		cp.calcularTotalPago(m);
		cp.calcularTotalPago(c);
	    System.out.println("O valor total pago pelo plano é: " + cp.getTotalPago());

	}

}
