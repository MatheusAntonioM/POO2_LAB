public class Tomate extends IngredienteDecorator {
    public Tomate(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 3.0; // Adiciona o custo do tomate
    }

    @Override
    public String descricao() {
        return pizza.descricao() + ", com tomate";
    }
}