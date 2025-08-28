package desafioVIII;
import java.util.ArrayList;
import java.util.List;

// Classe abstrata que implementa a interface
public abstract class RepositorioMemoria<T extends Identificavel> implements Repositorio<T> {
    protected List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        lista.add(obj);
    }

    @Override
    public T buscarPorId(int id) {
        for (T obj : lista) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null;
    }

    @Override
    public List<T> listarTodos() {
        return lista;
    }
}
