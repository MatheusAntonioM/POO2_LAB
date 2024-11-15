public class Loja {
    public static void main(String[] args) {
        Pedido pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido(3, 100.0);

        Pedido pedidoNaLoja = new PedidoNaLoja();
        pedidoNaLoja.processarPedido(2, 50.0);

        Pedido pedidoCripto = new PedidoCripto();
        pedidoCripto.processarPedido(5, 200.0);
    }
}