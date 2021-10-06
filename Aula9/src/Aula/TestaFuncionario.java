package Aula;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario[] f = new Funcionario[2];
		
		f[0] = new Funcionario("Jorge", "Gerente", 1000); 
		f[1] = new Funcionario("Ana", "CEO", 5500); 
		
		System.out.println("---------Funcionário---------");
		System.out.println("Nome: " + f[0].getNome() 
						+ "\nCargo: " + f[0].getCargo() 
						+ "\nSalário: " + f[0].getSalario() 
						+ "\nSalário com Abono: " + f[0].abonoSalario(100));
		
		System.out.println("---------Funcionário---------");
		System.out.println("Nome: " + f[1].getNome() 
						+ "\nCargo: " + f[1].getCargo() 
						+ "\nSalário: " + f[1].getSalario() 
						+ "\nSalário com Abono: " + f[1].abonoSalario(250));
	}

}
