public class Queijo extends IngredienteDecorator {
    public Queijo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 5.0; // Adiciona o custo do queijo
    }

    @Override
    public String descricao() {
        return pizza.descricao() + ", com queijo";
    }
}