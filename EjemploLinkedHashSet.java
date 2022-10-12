
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
    
}