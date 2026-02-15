public class Materia {
    private String nombre;
    private String id;
    private int creditos;
    private int horas;

    public Materia() {
        this.nombre = "Sin Nombre";
        this.id = "xxxx";
        this.creditos = 0;
        this.horas = 0;
    }

    public Materia(String nombre, String id, int creditos, int horas) {
        this.nombre = nombre;
        this.id = id;
        this.creditos = creditos;
        this.horas = horas;
    }

    public Materia(Materia m) {
        this.nombre = m.nombre;
        this.id = m.id;
        this.creditos = m.creditos;
        this.horas = m.horas;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public int getCreditos() { return creditos; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    @Override
    public String toString() {
        return "Materia: " + nombre + " Horas: " + horas + ", Creditos: " + creditos;
    }
}