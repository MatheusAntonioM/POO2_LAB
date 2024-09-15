public class PavaoAdapter implements AveAdapter {
    private Pavao pavao;

    public PavaoAdapter(Pavao pavao) {
        this.pavao = pavao;
    }

    @Override
    public void realizarAcoes() {
        pavao.voar();
        pavao.emitirSom();
    }
}