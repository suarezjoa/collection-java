import java.util.AbstractSet;
import java.util.Collection;
import java.util.TreeSet;

import javax.swing.table.AbstractTableModel;

public class xs {
    AbstractSet<Integer> abs_set = new TreeSet<>();

    public void AñadirABS(int algo){ 
        abs_set.add(algo);
    }
    public String mostrarABS(){
        return (abs_set + "");
    }
    public void removerABS(int algo){
        abs_set.remove(algo);
    }
    public int cantElemtABS(){
        return abs_set.size();
    }
    public int nrosDeLaListABS(){
        return abs_set.size();
    }
    public void removerTodoABS(){
        abs_set.clear();
    }
    public boolean removerList(EjemploTreeSet algo){
        return abs_set.remove(algo);
    }
}
