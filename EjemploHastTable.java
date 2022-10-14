import java.util.Hashtable;
import java.util.Map;

public class EjemploHastTable {

    Hashtable<String, Object> htpersona = new Hashtable<String, Object>( 50);

    public void agregar(String clave,Object elem){
        htpersona.put(clave, elem);
    }

    public void remplazarValor(String clave,Object elem){
        htpersona.put(clave, elem);
    }
    public void remplazarClave(String Clave, Object elem, String nuevaClave){
        htpersona.replace(Clave,elem,nuevaClave);
    }

    public void eliminar(String clave){
        htpersona.remove(clave);
    }

    public void mostrarTabla(String clave, Object elem){
        htpersona.values();
    }

}
