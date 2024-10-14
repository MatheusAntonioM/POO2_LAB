public class App {
    public static void main(String[] args) {
        Amplificador amplificador = new Amplificador();
        Luzes luzes = new Luzes();
        MaquinaDePipoca pipoca = new MaquinaDePipoca();
        Projetor projetor = new Projetor();
        Tela tela = new Tela();
        PlayerDeStreaming player = new PlayerDeStreaming();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplificador, luzes, pipoca, projetor, tela, player);

        homeTheater.assistirFilme("Inception");

        homeTheater.fimDoFilme();
    }
}
