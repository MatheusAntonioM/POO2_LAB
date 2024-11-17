public class App {
    public static void main(String[] args) {
        CarrinhoCompras carrinho = new CarrinhoCompras();
        
        carrinho.adicionaItem(new Item("Livro", 30.0, 0.5));
        carrinho.adicionaItem(new Item("Caneta", 5.0, 0.1));
        carrinho.adicionaItem(new Item("Caderno", 15.0, 0.7));

        System.out.println("Total: R$" + carrinho.calculaTotal());

        carrinho.setFreteStrategy(new SedexFrete());
        carrinho.calculaFrete();

        carrinho.setFreteStrategy(new NormalFrete());
        carrinho.calculaFrete();

        carrinho.setPagamentoStrategy(new PixPagamento());
        carrinho.realizaPagamento();
    }
}