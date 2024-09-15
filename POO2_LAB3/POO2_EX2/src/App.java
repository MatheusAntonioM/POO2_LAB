public class App {
    public static void main(String[] args) {
        // Instancia a calculadora binária existente
        CalculadoraBinariaExistente calculadoraBinariaExistente = new CalculadoraBinariaExistente();
        
        // Cria o adaptador para usar a calculadora binária com números decimais
        Calculadora calculadoraAdaptada = new CalculadoraAdapter(calculadoraBinariaExistente);

        // Operações com a calculadora adaptada
        System.out.println("Operações com a calculadora adaptada:");

        int soma = calculadoraAdaptada.somar(5, 3); // 5 + 3 = 8
        System.out.println("5 + 3 = " + soma);

        int subtracao = calculadoraAdaptada.subtrair(10, 4); // 10 - 4 = 6
        System.out.println("10 - 4 = " + subtracao);

        int multiplicacao = calculadoraAdaptada.multiplicar(7, 6); // 7 * 6 = 42
        System.out.println("7 * 6 = " + multiplicacao);
    }
}
