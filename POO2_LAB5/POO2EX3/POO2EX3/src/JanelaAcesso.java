import javax.swing.*;
import java.awt.event.*;

public class JanelaAcesso extends JFrame {
    private JTextField campoUsuario;
    private JPasswordField campoSenha;
    private JButton botaoAcessar;
    private SistemaUsuarios sistema;

    public JanelaAcesso(SistemaUsuarios sistema) {
        this.sistema = sistema;
        setTitle("Acesso ao Sistema");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Criando os componentes da interface
        campoUsuario = new JTextField(15);
        campoSenha = new JPasswordField(15);
        botaoAcessar = new JButton("Acessar");

        // Adicionando ação ao botão de acesso
        botaoAcessar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());

                Usuario u = sistema.autenticarUsuario(usuario, senha);

                if (u != null) {
                    if (u.temAcessoConfidencial()) {
                        JOptionPane.showMessageDialog(null, "Acesso concedido aos arquivos confidenciais.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Acesso concedido apenas aos arquivos públicos.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
                }
            }
        });

        // Layout da janela
        JPanel painel = new JPanel();
        painel.add(new JLabel("Usuário:"));
        painel.add(campoUsuario);
        painel.add(new JLabel("Senha:"));
        painel.add(campoSenha);
        painel.add(botaoAcessar);

        add(painel);
    }
}
