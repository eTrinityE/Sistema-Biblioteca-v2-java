import java.time.LocalDate;
import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private List<Item> itens;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, List<Item> itens, LocalDate dataEmprestimo) {
        this.usuario = usuario;
        this.itens = itens;
        this.dataEmprestimo = dataEmprestimo;
    }

    public void fazerEmprestimo() {
        for (Item item : itens) {
            if (!item.isDisponivel()) {
                throw new RuntimeException("O item " + item.getTitulo() + " não está disponível para empréstimo.");
            }
            item.setDisponivel(false);
        }
        usuario.getCarrinho().clear();
        dataDevolucao = null;
    }

    public void devolverEmprestimo() {
        dataDevolucao = LocalDate.now();
        for (Item item : itens) {
            item.setDisponivel(true);
        }
    }

    public void imprimir() {
        System.out.println("Usuário: " + usuario.getNome());
        System.out.println("Data do empréstimo: " + dataEmprestimo);
        System.out.println("Data da devolução: " + dataDevolucao);
        System.out.println("Itens emprestados:");
        for (Item item : itens) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                System.out.println("- Livro: " + livro.getTitulo() + ", " + livro.getAutor() + ", " + livro.getAnoPublicacao() + ", " + livro.getEditora() + ", " + livro.getNumPaginas() + " páginas");
            } else if (item instanceof Revista) {
                Revista revista = (Revista) item;
                System.out.println("- Revista: " + revista.getTitulo() + ", " + revista.getAutor() + ", " + revista.getNumeroEdicao() + ", " + revista.getEditora());
            } else if (item instanceof DVD) {
                DVD dvd = (DVD) item;
                System.out.println("- DVD: " + dvd.getTitulo() + ", " + dvd.getAutor() + ", " + dvd.getGenero() + ", " + dvd.getDuracao() + " minutos");
            }
        }
    }
}

