class CarroFacade {
    private Motor motor;
    private CintoDeSeguranca cinto;
    private Porta porta;
    private Farol farol;
    private Radio radio;

    public CarroFacade() {
        this.motor = new Motor();
        this.cinto = new CintoDeSeguranca();
        this.porta = new Porta();
        this.farol = new Farol();
        this.radio = new Radio();
    }

    public void iniciarCorrida(String estacaoRadio) {
        System.out.println("Preparando o carro para iniciar a corrida...");
        motor.ligar();
        porta.trancar();
        cinto.travar();
        farol.acender();
        radio.ligar();
        radio.sintonizar(estacaoRadio);
        System.out.println("Corrida iniciada.");
    }

    public void finalizarCorrida() {
        System.out.println("Finalizando a corrida e desligando o carro...");
        motor.desligar();
        porta.destrancar();
        cinto.destravar();
        farol.apagar();
        radio.desligar();
        System.out.println("Carro desligado.");
    }
}
