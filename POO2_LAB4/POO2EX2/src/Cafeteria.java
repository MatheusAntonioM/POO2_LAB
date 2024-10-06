public class Cafeteria {
    public static void main(String[] args) {
        
        Bebida bebida1 = new Espresso();
        bebida1 = new Leite(bebida1); 
        bebida1 = new Canela(bebida1); 

        System.out.println("Pedido 1:");
        System.out.println("Descrição: " + bebida1.getDescricao());
        System.out.println("Custo: R$" + bebida1.calculaCusto());

        Bebida bebida2 = new Decaf();
        bebida2 = new Chocolate(bebida2); 
        bebida2 = new Creme(bebida2); 
        System.out.println("\nPedido 2:");
        System.out.println("Descrição: " + bebida2.getDescricao());
        System.out.println("Custo: R$" + bebida2.calculaCusto());
    }
}
