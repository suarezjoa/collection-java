import java.util.AbstractSet;
import java.util.Collection;
import java.util.TreeSet;

import javax.swing.table.AbstractTableModel;

public class EjemploAbsSet {
    AbstractSet<Object> abs_set = new TreeSet<>();

    public void agregarABS(Object algo){ 
        abs_set.add(algo);
    }

    public String mostrarABS(){
        return (abs_set + "");
    }

    public void removerABS(Object algo){
        abs_set.remove(algo);
    }

    public boolean existeElemento(Object elemento){
        return abs_set.contains(elemento);
    }

    public int nrosDeLaListABS(){
        return abs_set.size();
    }

    public void removerTodoABS(){
        abs_set.clear();
    }

    public boolean removerCollection(Collection<Object> collecionRemove){
        return abs_set.removeAll(collecionRemove);
    }

    public boolean compruebaCollection(Collection<Object> collecionComprobar){
        return abs_set.containsAll(collecionComprobar);
    }
    
    public boolean agregarCollection(Collection<Object> collecionAgregar){
        return abs_set.containsAll(collecionAgregar);
    }

    public boolean soloDejarCollection(Collection<Object> collecionDejar){
        return abs_set.retainAll(collecionDejar);
    }

}
