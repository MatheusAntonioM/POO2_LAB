public class Ovo extends IngredienteDecorator {
    public Ovo(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 10.0; // Adiciona o custo do ovo
    }

    @Override
    public String descricao() {
        return pizza.descricao() + ", com ovo";
    }
}