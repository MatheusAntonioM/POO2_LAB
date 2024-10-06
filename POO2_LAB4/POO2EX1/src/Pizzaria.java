public class Pizzaria {
    public static void main(String[] args) {
        
        Pizza marguerita = new MassaFinaPizza();
        marguerita = new Queijo(marguerita); 
        marguerita = new Tomate(marguerita); 
        marguerita = new Manjericao(marguerita); 

        System.out.println("Pizza Marguerita:");
        System.out.println("Custo: R$" + marguerita.custo());
        System.out.println("Descrição: " + marguerita.descricao());

        Pizza portuguesa = new MassaEspessaPizza();
        portuguesa = new Queijo(portuguesa); 
        portuguesa = new Ovo(portuguesa); 
        portuguesa = new Tomate(portuguesa); 

        System.out.println("\nPizza Portuguesa:");
        System.out.println("Custo: R$" + portuguesa.custo());
        System.out.println("Descrição: " + portuguesa.descricao());
    }
}
