public class PatoAdapter implements AveAdapter {
    private Pato pato;

    public PatoAdapter(Pato pato) {
        this.pato = pato;
    }

    @Override
    public void realizarAcoes() {
        pato.voar();
        pato.emitirSom();
    }
}
