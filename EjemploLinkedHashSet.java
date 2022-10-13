
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

//Los elementos del conjunto se encunetran en el orden que se insertan, similar a una lista pero sin dejar ingresar valores repetidos
//
//
//

public class EjemploLinkedHashSet  {
    Set<String> implementoLinkedHashSet = new LinkedHashSet<>();

    public void Añadir(String algo){ 
        implementoLinkedHashSet.add(algo);
    }
    public String mostrar(){
        return (implementoLinkedHashSet + "");
    }
    public boolean existeElemento(Object algo){
        return implementoLinkedHashSet.contains(algo);
    }
    public int nrosDeLaList(){
        return implementoLinkedHashSet.size();
    }
    public void removerTodo(){
        implementoLinkedHashSet.clear();
    }
    public void remover(Object algo){
        implementoLinkedHashSet.remove(algo);
    }
    
}