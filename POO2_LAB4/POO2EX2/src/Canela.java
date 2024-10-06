public class Canela extends IngredienteDecorator {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.3; // Adiciona o custo da canela
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com canela";
    }
}
