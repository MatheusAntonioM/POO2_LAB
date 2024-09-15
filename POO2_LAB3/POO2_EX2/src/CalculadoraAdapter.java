public class CalculadoraAdapter implements Calculadora {
    private CalculadoraBinariaExistente calculadoraBinaria;

    public CalculadoraAdapter(CalculadoraBinariaExistente calculadoraBinaria) {
        this.calculadoraBinaria = calculadoraBinaria;
    }

    @Override
    public int somar(int a, int b) {
        String binarioA = Integer.toBinaryString(a); // Converte decimal para binário
        String binarioB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.somar(binarioA, binarioB);
        return Integer.parseInt(resultadoBinario, 2); // Converte binário de volta para decimal
    }

    @Override
    public int subtrair(int a, int b) {
        String binarioA = Integer.toBinaryString(a);
        String binarioB = Integer.toBinaryString(b);
        String resultadoBinario = calculadoraBinaria.subtrair(binarioA, binarioB);
        return Integer.parseInt(resultadoBinario, 2);
    }

    @Override
    public int multiplicar(int a, int b) {
        // Operação multiplicação é feita diretamente em decimal
        return a * b;
    }
}
