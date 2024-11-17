class NormalFrete implements FreteStrategy {
    @Override
    public double calculaFrete(double pesoTotal) {
        double frete = pesoTotal * 10; // Exemplo: R$10 por kg
        System.out.println("Frete calculado via Normal: R$" + frete);
        return frete;
    }
}