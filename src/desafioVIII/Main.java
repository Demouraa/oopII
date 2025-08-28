package desafioVIII;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        RepositorioProduto repoProdutos = new RepositorioProduto();
        RepositorioCliente repoClientes = new RepositorioCliente();

        // Salvando produtos
        repoProdutos.salvar(new Produto(1, "Notebook"));
        repoProdutos.salvar(new Produto(2, "Mouse"));

        // Salvando clientes
        repoClientes.salvar(new Cliente(1, "Matheus"));
        repoClientes.salvar(new Cliente(2, "Ana"));

        // Testando busca
        System.out.println("Produto com ID 1: " + repoProdutos.buscarPorId(1));
        System.out.println("Cliente com ID 2: " + repoClientes.buscarPorId(2));

        // Listando todos
        System.out.println("\nLista de Produtos:");
        for (Produto p : repoProdutos.listarTodos()) {
            System.out.println(p);
        }

        System.out.println("\nLista de Clientes:");
        for (Cliente c : repoClientes.listarTodos()) {
            System.out.println(c);
        }
    }
}

