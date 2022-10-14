
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// no se puede duplicar elemntos en esta collecion
// puede o no tener un orden
// no existe un metodo para recuperar un elemento en alguna posicion

public class EjemploHashSet  {
    Set<Object> implementoHash = new HashSet<>();



    public void agregar(Object algo){ 
        implementoHash.add(algo);
    }
    public String mostrar(){
        return (implementoHash + "");
    }
    public boolean existeElemento(Object algo){
        return implementoHash.contains(algo);
    }
    public void remover(Object algo){
        implementoHash.remove(algo);
    }
    public int nrosDeLaList(){
    return implementoHash.size();
    }
    public void removerTodo(){
        implementoHash.clear();
    }
    
}