public class Alumno extends Persona {
    private String matricula;
    private int edad;
    private Curso cursoAsignado;

    public Alumno() {
        super();
        this.matricula = "xxxxxxx";
        this.edad = 0;
        this.cursoAsignado = null;
    }

    public Alumno(String nombre, String matricula, int edad) {
        super(nombre);
        this.matricula = matricula;
        this.edad = edad;
        this.cursoAsignado = null;
    }

    public Alumno(Alumno a) {
        super(a.nombre);
        this.matricula = a.matricula;
        this.edad = a.edad;
        this.cursoAsignado = a.cursoAsignado;
    }

    public void asignarCurso(Curso c) {
        this.cursoAsignado = c;
    }

    @Override
    public String toString() {
        String cursoStr = (cursoAsignado != null) ? cursoAsignado.getNombre() : "Sin inscribir";
        return "Alumno: " + nombre + " (" + edad + " años) | Matrícula: " + matricula + " | Cursando: " + cursoStr;
    }
}