import java.util.ArrayList;
import java.util.List;

public class CET {
    private List<Observer> observadores;
    private float temperatura;
    private float umidade;
    private float velocidadeVento;

    public CET() {
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
            observador.atualizar(temperatura, umidade, velocidadeVento);
        }
    }

    public void setDados(float temperatura, float umidade, float velocidadeVento) {
        this.temperatura = temperatura;
        this.umidade = umidade;
        this.velocidadeVento = velocidadeVento;
        notificarObservadores();
    }
}
