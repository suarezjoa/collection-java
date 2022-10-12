
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

// no se puede duplicar elemntos en esta collecion
// puede o no tener un orden
// no existe un metodo para recuperar un elemento en alguna posicion

public class EjemploHashSet  {
    Set<String> implementoHash = new HashSet<>();

    public void Añadir(String algo){ 
        implementoHash.add(algo);
    }
    public String mostrar(){
        return (implementoHash + "");
    }
    
}