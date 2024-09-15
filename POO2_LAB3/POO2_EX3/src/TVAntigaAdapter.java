public class TVAntigaAdapter implements ControleRemoto {
    private TVAntigaLegada tvAntiga;

    public TVAntigaAdapter(TVAntigaLegada tvAntiga) {
        this.tvAntiga = tvAntiga;
    }

    @Override
    public void ligar() {
        tvAntiga.powerOn();
    }

    @Override
    public void desligar() {
        tvAntiga.powerOff();
    }
}
