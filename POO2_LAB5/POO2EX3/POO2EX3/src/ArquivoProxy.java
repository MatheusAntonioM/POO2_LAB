// Proxy que controla o acesso ao arquivo real
class ArquivoProxy implements Arquivo {
    private ArquivoReal arquivoReal;
    private String nome;
    private String conteudo;
    private boolean isConfidencial;
    private Usuario usuario;

    public ArquivoProxy(String nome, String conteudo, boolean isConfidencial, Usuario usuario) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.isConfidencial = isConfidencial;
        this.usuario = usuario;
    }

    @Override
    public void exibirConteudo() {
        // Se o arquivo for confidencial, verifica se o usuário tem permissão
        if (isConfidencial) {
            if (usuario.temPermissao()) {
                if (arquivoReal == null) {
                    arquivoReal = new ArquivoReal(nome, conteudo);
                }
                arquivoReal.exibirConteudo();
            } else {
                System.out.println("Acesso negado: o usuário não tem permissão para visualizar este arquivo.");
            }
        } else {
            if (arquivoReal == null) {
                arquivoReal = new ArquivoReal(nome, conteudo);
            }
            arquivoReal.exibirConteudo();
        }
    }
}
