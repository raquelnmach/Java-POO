package exercicios;

public class TestaPedido {

	public static void main(String[] args) {
	
		Pedido pedido1 = new Pedido(89,1,150);
        Pedido pedido2 = new Pedido(23,1,100);
        Pedido pedido3 = new Pedido(121,1,250.00);

        pedido1.finalizarPedido();
        pedido2.finalizarPedido();
        pedido3.finalizarPedido();
              
        System.out.println("Total de pedidos: " + Pedido.totalPedidos);

       }

}
