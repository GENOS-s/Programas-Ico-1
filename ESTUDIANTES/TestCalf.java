import java.util.Scanner;


public class TestCalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la fecha de nacimiento (dd/mm/aaaa): ");
        String fechaNacimiento = sc.nextLine();

        System.out.print("Ingrese el ID del alumno: ");
        String idAlumno = sc.nextLine();

        System.out.print("Ingrese la carrera: ");
        String carrera = sc.nextLine();

        System.out.print("Ingrese el grado obtenido (Licenciatura, Master, Ph.D): ");
        String gradoObtenido = sc.nextLine();

        System.out.print("Ingrese el año de graduación esperado: ");
        int anioGraduacion = sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el número de calificaciones: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] calificaciones = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese calificación #" + (i + 1) + " (A, B+, C, etc.): ");
            calificaciones[i] = sc.nextLine();
        }

        Estudiante estudiante = new Estudiante(nombre, fechaNacimiento, idAlumno,
                                               carrera, gradoObtenido, anioGraduacion);

        estudiante.calcularPromedio(calificaciones);

        System.out.println("\n--- Datos del Estudiante ---");
        System.out.println(estudiante.toString());

        // Opción para modificar la carrera
        System.out.print("\n¿Desea modificar la carrera del estudiante? /n 1: si /n 2:NO ");
        int opcion = sc.nextInt();
        if (opcion==1) {
            System.out.print("Ingrese la nueva carrera: ");
            String nuevaCarrera = sc.nextLine();
            estudiante.cambiarCarrera(nuevaCarrera);
            System.out.println("\n--- Datos Actualizados del Estudiante ---");
            System.out.println(estudiante.toString());
        } else {
            System.out.println("\nGracias por usar el programa");
        }
    }
}
