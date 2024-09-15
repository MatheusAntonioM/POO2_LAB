public class App {
        public static void main(String[] args) {
            // Controle de uma TV Inteligente
            ControleRemoto tvInteligente = new TVInteligente();
            System.out.println("Controle da TV Inteligente:");
            tvInteligente.ligar();
            tvInteligente.desligar();
    
            // Controle de uma TV antiga utilizando o Adapter
            TVAntigaLegada tvAntiga = new TVAntigaLegada();
            ControleRemoto tvAntigaAdapter = new TVAntigaAdapter(tvAntiga);
            System.out.println("\nControle da TV Antiga usando Adapter:");
            tvAntigaAdapter.ligar();
            tvAntigaAdapter.desligar();
        }
    }
    