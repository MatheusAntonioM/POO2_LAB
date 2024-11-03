public class Investidor implements Observer {
    private String nome;
    private float limiteMinimo;
    private float limiteMaximo;
    private AcaoBroker acaoBroker;
    private Acao acao;

    public Investidor(String nome, float limiteMinimo, float limiteMaximo, Acao acao, AcaoBroker acaoBroker) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
        this.acao = acao;
        this.acaoBroker = acaoBroker;
        acao.registrarObservador(this);
    }

    @Override
    public void atualizar(float precoAtual) {
        System.out.println(nome + " foi notificado. Preço atual da ação: " + precoAtual);
        
        if (precoAtual >= limiteMaximo) {
            System.out.println(nome + ": Limite máximo atingido! Instruindo corretor a vender.");
            acaoBroker.venderAcao(acao);
        } else if (precoAtual <= limiteMinimo) {
            System.out.println(nome + ": Limite mínimo atingido! Considerando compra.");
            acaoBroker.comprarAcao(acao);
        }
    }
}
