public class DVD extends Item {
    private String genero;
    private int duracao;

    public DVD(String titulo, String autor, boolean disponivel, String genero, int duracao) {
        super(titulo, autor, disponivel);
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracao() {
        return duracao;
    }
}
