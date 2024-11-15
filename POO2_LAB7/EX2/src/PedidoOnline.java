class PedidoOnline extends Pedido {
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Processando pagamento online de: " + valorTotal);
    }

    @Override
    boolean verificarEntrega() {
        return true;
    }
}