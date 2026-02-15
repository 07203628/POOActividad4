public class Curso {
    private String nombre;
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

    public Curso() {
        this.nombre = "Curso Genérico";
        this.materia1 = new Materia();
        this.materia2 = new Materia();
        this.materia3 = new Materia();
    }

    public Curso(String nombre, Materia m1, Materia m2, Materia m3) {
        this.nombre = nombre;
        this.materia1 = new Materia(m1);
        this.materia2 = new Materia(m2);
        this.materia3 = new Materia(m3);
    }

    public int obtenerCreditosTotales() {
        return materia1.getCreditos() + materia2.getCreditos() + materia3.getCreditos();
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    @Override
    public String toString() {
        return "Curso: " + nombre + " | Créditos Totales: " + obtenerCreditosTotales();
    }
}