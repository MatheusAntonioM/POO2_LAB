public class App {
    public static void main(String[] args) throws Exception {
        CET cet = new CET();

        Prefeitura prefeitura = new Prefeitura();
        Aeroporto aeroporto = new Aeroporto();

        cet.registrarObservador(prefeitura);
        cet.registrarObservador(aeroporto);

        // Atualizando os dados do tempo
        cet.setDados(25.0f, 40.0f, 20.0f);
        cet.setDados(30.0f, 35.0f, 25.0f);
    }
}
