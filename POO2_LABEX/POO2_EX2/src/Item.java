class Item {
    @SuppressWarnings("unused")
    private String nome;
    private double preco;
    private double peso;

    public Item(String nome, double preco, double peso) {
        this.nome = nome;
        this.preco = preco;
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public double getPeso() {
        return peso;
    }
}