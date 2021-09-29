package Aula3;

public class MainMovel {

	public static void main(String[] args) {
		Imovel imovel1 = new Imovel();
		
		imovel1.codImovel = 1;
		imovel1.bairro = "Centro";
		imovel1.tipo = "apto";
		imovel1.valor = 25000;
		
		System.out.println("Código do Imóvel: " + imovel1.codImovel + "\n");
		System.out.println("Bairro: " + imovel1.bairro + "\n");
		System.out.println("Tipo do Imóvel: " + imovel1.tipo + "\n");
		System.out.println("Valor Normal: " + imovel1.valor + "\n");
		imovel1.calculaReajuste();
		System.out.println("Valor do Reajuste: " + imovel1.valor + "\n");
	    System.out.println("Categoria: " + imovel1.categoriaImovel() + "\n");
		
		
		Imovel imovel2 = new Imovel();
		
		imovel2.codImovel = 2;
		imovel2.bairro = "Quintandinha";
		imovel2.tipo = "casa";
		imovel2.valor = 98900;	
		
		System.out.println("Código do Imóvel: " + imovel2.codImovel + "\n");
		System.out.println("Bairro: " + imovel2.bairro + "\n");
		System.out.println("Tipo do Imóvel: " + imovel2.tipo + "\n");
		System.out.println("Valor Normal: " + imovel2.valor + "\n");
		imovel2.calculaReajuste();
		System.out.println("Valor do Reajuste: " + imovel2.valor + "\n");
	    System.out.println("Categoria: " + imovel2.categoriaImovel() + "\n");

	}
		
}
