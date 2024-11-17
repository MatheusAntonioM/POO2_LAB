class SedexFrete implements FreteStrategy {
    @Override
    public double calculaFrete(double pesoTotal) {
        double frete = pesoTotal * 15; 
        System.out.println("Frete calculado via Sedex: R$" + frete);
        return frete;
    }
}