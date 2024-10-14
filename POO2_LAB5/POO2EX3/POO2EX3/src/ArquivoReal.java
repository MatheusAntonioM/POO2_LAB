// Representa o arquivo real que contém o conteúdo
class ArquivoReal implements Arquivo {
    private String nome;
    private String conteudo;

    public ArquivoReal(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    @Override
    public void exibirConteudo() {
        System.out.println("Exibindo conteúdo do arquivo " + nome + ": " + conteudo);
    }
}
