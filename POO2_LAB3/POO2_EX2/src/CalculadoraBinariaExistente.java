public class CalculadoraBinariaExistente {
    public String somar(String a, String b) {
        int numero1 = Integer.parseInt(a, 2); // Converte binário para inteiro
        int numero2 = Integer.parseInt(b, 2);
        int resultado = numero1 + numero2;
        return Integer.toBinaryString(resultado); // Converte o resultado de volta para binário
    }

    public String subtrair(String a, String b) {
        int numero1 = Integer.parseInt(a, 2);
        int numero2 = Integer.parseInt(b, 2);
        int resultado = numero1 - numero2;
        return Integer.toBinaryString(resultado);
    }
}
