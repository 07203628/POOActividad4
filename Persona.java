public class Persona { 
    protected String nombre;

    public Persona() {
        this.nombre = "Sin Nombre";
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(Persona p) {
        this.nombre = p.nombre;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}