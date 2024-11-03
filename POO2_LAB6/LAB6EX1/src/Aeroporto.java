public class Aeroporto implements Observer {
    @Override
    public void atualizar(float temperatura, float umidade, float velocidadeVento) {
        System.out.println("Aeroporto: Velocidade do vento atual: " + velocidadeVento + " km/h");
    }
}
