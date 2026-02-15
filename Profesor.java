public class Profesor extends Persona {
    private int numeroNomina;
    private double sueldoPorHora;
    private Materia materiaAsignada;

    public Profesor(){
        super();
        this.numeroNomina = 0;
        this.sueldoPorHora = 0.0;
        this.materiaAsignada = null;
    }

    public Profesor(String nombre, int numeroNomina, double sueldoPorHora) {
        super(nombre);
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materiaAsignada = null;
    }

    public Profesor(Profesor p) {
        super(p.nombre);
        this.numeroNomina = p.numeroNomina;
        this.sueldoPorHora = p.sueldoPorHora;
        this.materiaAsignada = p.materiaAsignada;
    }

    public double calcularSueldo() {
        if (materiaAsignada != null) {
            return sueldoPorHora * materiaAsignada.getHoras();
        } else {
            return 0.0;
        }
    }

    public void asignarMateria(Materia m) {
        this.materiaAsignada = m;
    }

    @Override
    public String toString() {
        String mat = (materiaAsignada != null) ? materiaAsignada.getNombre() : "Ninguna";
        return "Prof. " + nombre + " | Nómina: " + numeroNomina + " | Materia: " + mat + " | Sueldo Semanal: $" + calcularSueldo();
    }
}