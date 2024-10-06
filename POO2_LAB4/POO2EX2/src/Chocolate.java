public class Chocolate extends IngredienteDecorator {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.7; // Adiciona o custo do chocolate
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com chocolate";
    }
}