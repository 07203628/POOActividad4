public class Actividad_4 {
    public static void main(String[] args) {
        System.out.println("--- SISTEMA ESCOLAR ---");

        System.out.println("> Creando materias...");
        Materia m1 = new Materia("Sistemas Operativos", "2306", 10, 10);
        Materia m2 = new Materia("Programación Orientada a Objetos", "2307", 10, 10);
        Materia m3 = new Materia("Ingles", "2308", 8, 10);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println("\n> Creando Curso...");
        Curso cursoIDS = new Curso("Ingreniería en Desarrollo de Sistemas", m1, m2, m3);
        System.out.println(cursoIDS);

        System.out.println("\n> Buscando Profesor...");
        Profesor profe1 = new Profesor("Ricardo Monroy", 12345, 400.00);

        System.out.println("Sueldo Inicial: $" + profe1.calcularSueldo());

        profe1.asignarMateria(m1);
        System.out.println("Materia asignada: " + m1.getNombre());
        System.out.println(profe1);

        System.out.println("\n> Inscribiendo Alumno...");
        Alumno alumno1 = new Alumno("Diego", "AL7203628", 20);

        alumno1.asignarCurso(cursoIDS);
        System.out.println(alumno1);

        System.out.println("\n> Prueba de copia...");
        Profesor profeCopia = new Profesor(profe1);
        profeCopia.setNombre("Ricardo Copia");
        System.out.println("Original: " + profe1.getNombre());
        System.out.println("Copia: " + profeCopia.getNombre());
    }
}