import java.util.TreeSet;
import java.util.Set;

// Los elementos del conjunto se almacenan de Menor a MAYOR

public class EjemploTreeSet {
    Set<Integer> implementoLTreeSet = new TreeSet<>();

    public void Añadir(int algo){ 
        implementoLTreeSet.add(algo);
    }
    public String mostrar(){
        return (implementoLTreeSet + "");
    }
    public void remover(int algo){
        implementoLTreeSet.remove(algo);
    }
    public boolean existeElemento(int algo){
        return implementoLTreeSet.contains(algo);
    }
    public int nrosDeLaList(){
        return implementoLTreeSet.size();
    }
    public void removerTodo(){
        implementoLTreeSet.clear();
    }
}
