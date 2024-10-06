public class Espresso implements Bebida {
    @Override
    public double calculaCusto() {
        return 4.0; // Custo base do Espresso
    }

    @Override
    public String getDescricao() {
        return "Espresso";
    }
}
