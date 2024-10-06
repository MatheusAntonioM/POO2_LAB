public class Creme extends IngredienteDecorator {
    public Creme(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.6; // Adiciona o custo do creme
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com creme";
    }
}