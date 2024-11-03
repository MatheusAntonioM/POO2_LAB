public class App {
        public static void main(String[] args) {

            Acao acao = new Acao(100.0f); 
            AcaoBroker acaoBroker = new AcaoBroker();
    
            Investidor investidor1 = new Investidor("Investidor A", 90.0f, 110.0f, acao, acaoBroker);
            Investidor investidor2 = new Investidor("Investidor B", 80.0f, 105.0f, acao, acaoBroker);
    
            
            acao.setPreco(95.0f);
            acao.setPreco(107.0f);
            acao.setPreco(110.0f); 
            acao.setPreco(120.0f); 
        }
    }
    