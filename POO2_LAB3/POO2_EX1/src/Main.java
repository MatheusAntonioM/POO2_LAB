public class Main {
    public static void main(String[] args) throws Exception {
        PatoDomestico patoDomestico = new PatoDomestico();
        PavaoAzul pavaoAzul = new PavaoAzul();

        // Usando Adapter para o PatoDomestico
        AveAdapter patoAdapter = new PatoAdapter(patoDomestico); 
        System.out.println("PatoDomestico Adapter:");
        patoAdapter.realizarAcoes();

        // Usando Adapter para o PavaoAzul
        AveAdapter pavaoAdapter = new PavaoAdapter(pavaoAzul); 
        System.out.println("\nPavaoAzul Adapter:");
        pavaoAdapter.realizarAcoes();
    }
}
