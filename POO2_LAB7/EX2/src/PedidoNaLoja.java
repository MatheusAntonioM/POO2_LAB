class PedidoNaLoja extends Pedido {
    @Override
    void processarPagamento(double valorTotal) {
        System.out.println("Pagamento realizado na loja de: " + valorTotal);
    }

    @Override
    boolean verificarEntrega() {
        return false;
    }
}
