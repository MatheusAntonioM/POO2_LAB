class HomeTheaterFacade {
    private Amplificador amplificador;
    private Luzes luzes;
    private MaquinaDePipoca pipoca;
    private Projetor projetor;
    private Tela tela;
    private PlayerDeStreaming player;

    public HomeTheaterFacade(Amplificador amplificador, Luzes luzes, MaquinaDePipoca pipoca, Projetor projetor, Tela tela, PlayerDeStreaming player) {
        this.amplificador = amplificador;
        this.luzes = luzes;
        this.pipoca = pipoca;
        this.projetor = projetor;
        this.tela = tela;
        this.player = player;
    }

    // Método para iniciar o filme
    public void assistirFilme(String filme) {
        System.out.println("Preparando para assistir ao filme...");
        pipoca.ligar();
        pipoca.rebentarPipoca();
        luzes.desligar();
        tela.abaixar();
        projetor.ligar();
        amplificador.ligar();
        amplificador.ajustarVolume(10);
        player.ligar();
        player.play(filme);
        System.out.println("Tudo pronto. Aproveite o filme!");
    }

    public void fimDoFilme() {
        System.out.println("Desligando o cinema...");
        player.desligar();
        amplificador.desligar();
        projetor.desligar();
        tela.levantar();
        luzes.ligar();
        pipoca.desligar();
        System.out.println("Cinema desligado. Até a próxima!");
    }
}
