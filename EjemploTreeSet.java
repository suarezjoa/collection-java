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
}
