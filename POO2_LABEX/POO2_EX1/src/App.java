public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        // Adicionando itens ao carrinho
        carrinho.adicionaItem(new Item("Livro", 30.0));
        carrinho.adicionaItem(new Item("Caneta", 5.0));
        carrinho.adicionaItem(new Item("Caderno", 15.0));

        // Calculando o total
        System.out.println("Total: R$" + carrinho.calculaTotal());

        // Realizando pagamento via Pix
        carrinho.setPagamentoStrategy(new PixPagamento());
        carrinho.realizaPagamento();

        // Realizando pagamento via Cartão de Crédito
        carrinho.setPagamentoStrategy(new CartaoPagamento());
        carrinho.realizaPagamento();

        // Realizando pagamento via Boleto Bancário
        carrinho.setPagamentoStrategy(new BoletoPagamento());
        carrinho.realizaPagamento();
    }
}