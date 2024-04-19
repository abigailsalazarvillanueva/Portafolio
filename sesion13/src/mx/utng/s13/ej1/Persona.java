package mx.utng.s13.ej1;

public class Persona {
    private String nombre;
    private String apellidos;
    
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void mostraDatos(){

        System.out.println("Persona: Nombre ->"+ nombre+" apellidos ->"+apellidos);
    }
}