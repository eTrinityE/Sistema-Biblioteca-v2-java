import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Usuario usuario1 = new Usuario("João", "joao@gmail.com", "Rua A, 123");
        Usuario usuario2 = new Usuario("Maria", "maria@gmail.com", "Rua B, 456");
        Usuario usuario3 = new Usuario("Pedro", "pedro@gmail.com", "Rua C, 789");

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", true, 1899, 256, "Garnier");
        Livro livro2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", true, 1954, 1008, "Martins Fontes");
        Revista revista1 = new Revista("Veja", "Editora Abril", true, 2718, "Editora Abril");
        Revista revista2 = new Revista("Super Interessante", "Editora Abril", true, 373, "Editora Abril");
        DVD dvd1 = new DVD("Pulp Fiction", "Quentin Tarantino", true, "Crime/Drama", 154);
        DVD dvd2 = new DVD("O Senhor dos Anéis: O Retorno do Rei", "Peter Jackson", true, "Fantasia/Ação", 201);

        List<Item> itensEmprestimo1 = new ArrayList<>();
        itensEmprestimo1.add(livro1);
        itensEmprestimo1.add(revista1);
        itensEmprestimo1.add(dvd1);
        Emprestimo emprestimo1 = new Emprestimo(usuario1, itensEmprestimo1, LocalDate.now());
        emprestimo1.fazerEmprestimo();
        emprestimo1.imprimir();

        List<Item> itensEmprestimo2 = new ArrayList<>();
        itensEmprestimo2.add(livro2);
        itensEmprestimo2.add(revista2);
        itensEmprestimo2.add(dvd2);
        usuario2.escolherItem(livro1);
        Emprestimo emprestimo2 = new Emprestimo(usuario2, itensEmprestimo2, LocalDate.now());
        emprestimo2.fazerEmprestimo();
        usuario2.devolverItem(livro1);
        emprestimo2.imprimir();
        
        List<Item> itensEmprestimo3 = new ArrayList<>();
        itensEmprestimo3.add(livro1);
        itensEmprestimo3.add(dvd1);
        Emprestimo emprestimo3 = new Emprestimo(usuario3, itensEmprestimo3, LocalDate.now());
        emprestimo3.fazerEmprestimo();
        emprestimo3.devolverEmprestimo();
        emprestimo3.imprimir();
    }
}
