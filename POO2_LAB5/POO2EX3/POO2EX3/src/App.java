public class App {
    public static void main(String[] args) {
        SistemaUsuarios sistema = new SistemaUsuarios();
        // Abre a janela de cadastro primeiro
        JanelaCadastro janelaCadastro = new JanelaCadastro(sistema);
        janelaCadastro.setVisible(true);
    }
}
