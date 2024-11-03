import java.util.ArrayList;
import java.util.List;

public class Acao {
    private List<Observer> observadores;
    private float precoAtual;

    public Acao(float precoInicial) {
        this.precoAtual = precoInicial;
        observadores = new ArrayList<>();
    }

    public void registrarObservador(Observer observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observer observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Observer observador : observadores) {
            observador.atualizar(precoAtual);
        }
    }

    public void setPreco(float novoPreco) {
        this.precoAtual = novoPreco;
        notificarObservadores();
    }

    public float getPreco() {
        return precoAtual;
    }
}
