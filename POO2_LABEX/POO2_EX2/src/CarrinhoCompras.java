import java.util.ArrayList;
import java.util.List;

class CarrinhoCompras {
    private List<Item> itens;
    private PagamentoStrategy pagamentoStrategy;
    private FreteStrategy freteStrategy;

    public CarrinhoCompras() {
        this.itens = new ArrayList<>();
    }

    public void adicionaItem(Item item) {
        itens.add(item);
    }

    public void removeItem(Item item) {
        itens.remove(item);
    }

    public double calculaTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public double calculaPesoTotal() {
        return itens.stream().mapToDouble(Item::getPeso).sum();
    }

    public void setPagamentoStrategy(PagamentoStrategy pagamentoStrategy) {
        this.pagamentoStrategy = pagamentoStrategy;
    }

    public void setFreteStrategy(FreteStrategy freteStrategy) {
        this.freteStrategy = freteStrategy;
    }

    public void realizaPagamento() {
        double total = calculaTotal();
        if (pagamentoStrategy != null) {
            pagamentoStrategy.pagar(total);
        } else {
            System.out.println("Estratégia de pagamento não definida.");
        }
    }

    public void calculaFrete() {
        double pesoTotal = calculaPesoTotal();
        if (freteStrategy != null) {
            double frete = freteStrategy.calculaFrete(pesoTotal);
            System.out.println("Valor do frete: R$" + frete);
        } else {
            System.out.println("Estratégia de frete não definida.");
        }
    }
}