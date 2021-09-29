package Aula3;

public class Imovel {
	 int codImovel; 
	 String bairro;
	 String tipo;
	 double valor;
	 	 
	 public void calculaReajuste(){
		
		 if (this.tipo == "casa") {
			this.valor *= 0.05;
		 } else {
			this.valor *= 0.08;
		 }
		 
	 }
	 
	 public String categoriaImovel () {
		 String categoria;
		 if (this.valor < 10.000) {
			 categoria = "C";			 
		 } else if (this.valor >= 10.000 && this.valor < 50.000) {
			 categoria = "B";			 
		 } else {
			 categoria = "A";
		 }
			return categoria; 
	 }
}
