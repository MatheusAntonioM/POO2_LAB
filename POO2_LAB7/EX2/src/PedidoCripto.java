class PedidoCripto extends Pedido {
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Pagamento realizado via criptomoeda de: " + valorTotal);
    }

    @Override
    boolean verificarEntrega() {
        return true;
    }
}