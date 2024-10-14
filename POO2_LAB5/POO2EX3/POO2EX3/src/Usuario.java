public class Usuario {
    private String nome;
    private String senha;
    private boolean acessoConfidencial;

    public Usuario(String nome, String senha, boolean acessoConfidencial) {
        this.nome = nome;
        this.senha = senha;
        this.acessoConfidencial = acessoConfidencial;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public boolean temAcessoConfidencial() {
        return acessoConfidencial;
    }
}
