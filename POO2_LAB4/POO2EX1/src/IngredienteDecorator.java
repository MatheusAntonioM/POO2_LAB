public abstract class IngredienteDecorator implements Pizza {
    protected Pizza pizza;

    public IngredienteDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public abstract double custo();

    @Override
    public abstract String descricao();
}