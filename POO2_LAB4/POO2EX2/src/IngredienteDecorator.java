public abstract class IngredienteDecorator implements Bebida {
    protected Bebida bebida;

    public IngredienteDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    @Override
    public abstract double calculaCusto();

    @Override
    public abstract String getDescricao();
}