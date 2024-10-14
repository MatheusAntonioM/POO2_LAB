import javax.swing.*;
import java.awt.event.*;

public class JanelaCadastro extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JCheckBox acessoConfidencial;
    private JButton botaoCadastrar;
    private SistemaUsuarios sistema;

    public JanelaCadastro(SistemaUsuarios sistema) {
        this.sistema = sistema;
        setTitle("Cadastro de Usuário");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando os componentes da interface
        campoUsuario = new JTextField(15);
        campoSenha = new JPasswordField(15);
        acessoConfidencial = new JCheckBox("Acesso a arquivos confidenciais?");
        botaoCadastrar = new JButton("Cadastrar");

        // Adicionando ação ao botão de cadastro
        botaoCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                boolean temAcessoConfidencial = acessoConfidencial.isSelected();

                if (usuario.isEmpty() || senha.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Usuário e senha não podem estar vazios.");
                } else {
                    // Cadastra o usuário no sistema
                    sistema.cadastrarUsuario(new Usuario(usuario, senha, temAcessoConfidencial));
                    JOptionPane.showMessageDialog(null, "Usuário " + usuario + " cadastrado com sucesso!");
                    // Abre a janela de acesso (login) após o cadastro
                    JanelaAcesso acesso = new JanelaAcesso(sistema);
                    acesso.setVisible(true);
                    dispose(); // Fecha a janela de cadastro
                }
            }
        });

        // Layout da janela
        JPanel painel = new JPanel();
        painel.add(new JLabel("Usuário:"));
        painel.add(campoUsuario);
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(acessoConfidencial);
        painel.add(botaoCadastrar);

        add(painel);
    }
}
