package desafioVIII;

public class Cliente implements Identificavel {
    private int id;
    private String nome;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Cliente{id=" + id + ", nome='" + nome + "'}";
    }
}