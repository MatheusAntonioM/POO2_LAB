public class Manjericao extends IngredienteDecorator {
    public Manjericao(Pizza pizza) {
        super(pizza);
    }

    @Override
    public double custo() {
        return pizza.custo() + 2.0; // Adiciona o custo do manjericão
    }

    @Override
    public String descricao() {
        return pizza.descricao() + ", com manjericão";
    }
}