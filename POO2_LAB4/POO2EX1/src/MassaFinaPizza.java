public class MassaFinaPizza implements Pizza {
    @Override
    public double custo() {
        return 50.0; // Custo base da massa fina
    }

    @Override
    public String descricao() {
        return "Pizza de massa fina";
    }
}