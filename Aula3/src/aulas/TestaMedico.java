package aulas;

public class TestaMedico {
	
	public static void main(String[] args) {
			
		Medico medico1 = new Medico(12345,"Ana Maria",0,250);
		Medico medico2 = new Medico(456789,"Antônio",0,300);
		
		medico1.pagamentoDinheiro(250);
		medico2.pagamentoDinheiro(300);

	
		System.out.println("CRM: " + medico1.getCrm() + "\n" + "Nome: " + medico1.getNome() + "\n" + "Salário:" + medico1.getSalario() + "\n" + "Valor da Consulta: " + medico1.getValorConsulta() + "\n");
		System.out.println("CRM: " + medico1.getCrm() + "\n" + "Nome: " + medico2.getNome() + "\n" + "Salário:" + medico2.getSalario() + "\n" + "Valor da Consulta: " + medico2.getValorConsulta() + "\n");
		System.out.println("O total de médicos é: " + Medico.totalMedicos);
	}

}
