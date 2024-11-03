public class Prefeitura implements Observer {
    @Override
    public void atualizar(float temperatura, float umidade, float velocidadeVento) {
        System.out.println("Prefeitura: Alerta de Defesa Civil! Umidade atual: " + umidade + "%");
    }
}
