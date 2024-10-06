public class Leite extends IngredienteDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double calculaCusto() {
        return bebida.calculaCusto() + 0.5; // Adiciona o custo do leite
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", com leite";
    }
}