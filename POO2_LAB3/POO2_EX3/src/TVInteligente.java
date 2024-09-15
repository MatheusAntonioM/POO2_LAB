public class TVInteligente implements ControleRemoto {
    @Override
    public void ligar() {
        System.out.println("A TV Inteligente está ligada.");
    }

    @Override
    public void desligar() {
        System.out.println("A TV Inteligente está desligada.");
    }
}
