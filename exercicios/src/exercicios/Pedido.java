package exercicios;

import java.time.LocalDate;

public class Pedido {
	private int numero;
	LocalDate dataPedido = LocalDate.now();
	private int quantidade;
	private double valor;
	public static int totalPedidos = 0;
	
	public Pedido() {
		totalPedidos += 1;
	}
	
	public Pedido(int numero, int quantidade, double valor) {
		this();
		this.numero = numero;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void finalizarPedido() {
		  if(dataPedido.getDayOfWeek().name() == "SUNDAY") {
			   this.valor = this.valor - (this.valor * 0.1);
				System.out.println("Quarta");
			}
		System.out.println("Número do Pedido: " + getNumero());
        System.out.println("Quantidade de Pedidos: " + getQuantidade());
        System.out.println("Valor do Pedido: " + calculaTotal() + "\n");
 	}
	
    public double calculaTotal() {
        double total = getQuantidade() * getValor();
        return total;
    }
}
