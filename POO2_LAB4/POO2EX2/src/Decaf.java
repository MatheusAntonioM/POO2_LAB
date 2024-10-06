public class Decaf implements Bebida {
    @Override
    public double calculaCusto() {
        return 3.5; // Custo base do Decaf
    }

    @Override
    public String getDescricao() {
        return "Café descafeinado";
    }
}