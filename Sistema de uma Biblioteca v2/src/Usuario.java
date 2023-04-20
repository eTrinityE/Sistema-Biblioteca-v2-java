import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private List<Item> carrinho;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.carrinho = new ArrayList<Item>();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Item> getCarrinho() {
        return carrinho;
    }

    public void escolherItem(Item item) {
        carrinho.add(item);
    }

    public void devolverItem(Item item) {
        carrinho.remove(item);
    }
}
