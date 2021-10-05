package Olimpiadas;

public class TestaAtleta {

	public static void main(String[] args) {
				
		Pais p1 = new Pais("Anderson Silva", 92, "Brasil");
		Pais p2 = new Pais("Jon Jones", 58, "EUA");
		Pais p3 = new Pais("Georges St. Pierre", 88, "Canadá");
		
		p1.verificaSituacao();
		p2.verificaSituacao();
		p3.verificaSituacao();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());

	}

}
