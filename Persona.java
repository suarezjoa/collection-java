public class Persona {

    public String Nombre;
    public String Apellido;
    public int Edad;



    public Persona(String nombre, String apellido, int edad) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }
    
    public void setEdad(int edad) {
        Edad = edad;
    }
}
