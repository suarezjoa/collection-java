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

    public void eliminar(String clave){
        htpersona.remove(clave);
    }
    public Object mostrarElemento(String clave){
        return htpersona.get(clave);
    }

    public Object mostrarTabla(){
        return htpersona.values();
    }

    public Hashtable<String, Object> getHtpersona() {
        return htpersona;
    }
    public void setHtpersona(Hashtable<String, Object> htpersona) {
        this.htpersona = htpersona;
    }
    

}
