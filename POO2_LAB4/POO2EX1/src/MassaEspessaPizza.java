public class MassaEspessaPizza implements Pizza {
    @Override
    public double custo() {
        return 60.0; // Custo base da massa espessa
    }

    @Override
    public String descricao() {
        return "Pizza de massa espessa";
    }
}
