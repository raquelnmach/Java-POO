package Mercado;

public class TestaMercado {

	public static void main(String[] args) {
		
		BebidaAlcoolica ba1 = new BebidaAlcoolica("Cerveja", 12.00, 4);
		BebidaAlcoolica ba2 = new BebidaAlcoolica("Vinho", 150.00, 8.6);
		
		Eletrodomestico e1 = new Eletrodomestico("TV", 2000, 110);
		Eletrodomestico e2 = new Eletrodomestico("Geladeira", 2352.64, 220);
		Eletrodomestico e3 = new Eletrodomestico("Radio", 837.59, 110);
		
		System.out.println(ba1.toString() + "Valor Total: " + ba1.vender(5));
		System.out.println(ba2.toString() + "Valor Total: " + ba2.vender(3));
		System.out.println(e1.toString() + "Valor Total: " + e1.vender(9));
		System.out.println(e2.toString() + "Valor Total: " + e2.vender(3));
		System.out.println(e3.toString() + "Valor Total: " + e3.vender(1));
		
	}

}
