abstract class Pedido {
    public final void processarPedido(int quantidadeItens, double valorItem) {
        double valorTotal = calcularValorTotal(quantidadeItens, valorItem);
        processarPagamento(valorTotal);
        if (verificarEntrega()) {
            System.out.println("Pedido será entregue.");
        } else {
            System.out.println("Retirada na loja.");
        }
    }

    protected double calcularValorTotal(int quantidadeItens, double valorItem) {
        return quantidadeItens * valorItem;
    }

    abstract void processarPagamento(double valorTotal);
    abstract boolean verificarEntrega();
}
