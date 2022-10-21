import java.util.TreeSet;
import java.util.Set;

// Los elementos del conjunto se almacenan de Menor a MAYOR
// Ejemplo de implementacion para un sorteo
public class EjemploTreeSet {

    Set<Object> implementoLTreeSet = new TreeSet<>();

    public void agregar(Object algo){ 
        implementoLTreeSet.add(algo);
    }
    public String mostrar(){
        return (implementoLTreeSet + "");
    }
    public void remover(Object algo){
        implementoLTreeSet.remove(algo);
    }
    public boolean existeElemento(Object algo){
        return implementoLTreeSet.contains(algo);
    }
    public int nrosDeLaList(){
        return implementoLTreeSet.size();
    }
    public void removerTodo(){
        implementoLTreeSet.clear();
    }
    public Set<Object> getImplementoLTreeSet() {
        return implementoLTreeSet;
    }
    public void setImplementoLTreeSet(Set<Object> implementoLTreeSet) {
        this.implementoLTreeSet = implementoLTreeSet;
    }
}
