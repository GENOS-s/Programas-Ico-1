public class Estudiante extends Persona {
    private String idAlumno;
    private double promCalif;
    private String carrera;
    private String gradoObtenido;
    private int anioGraduacion;

    public Estudiante(String nombre, String fechaNacimiento, String idAlumno,
                      String carrera, String gradoObtenido, int anioGraduacion) {
        super(nombre, fechaNacimiento);
        this.idAlumno = idAlumno;
        this.carrera = carrera;
        this.gradoObtenido = gradoObtenido;
        this.anioGraduacion = anioGraduacion;
        this.promCalif = 0.0;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public double getPromCalif() {
        return promCalif;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getGradoObtenido() {
        return gradoObtenido;
    }

    public int getAnioGraduacion() {
        return anioGraduacion;
    }

    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    public void calcularPromedio(String[] calificaciones) {
        double suma = 0.0;
        for (String calif : calificaciones) {
            suma += convertirCalificacion(calif);
        }
        this.promCalif = suma / calificaciones.length;
    }

    private double convertirCalificacion(String letra) {
        return switch (letra.toUpperCase()) {
            case "A" -> 4.0;
            case "A-" -> 3.67;
            case "B+" -> 3.33;
            case "B" -> 3.0;
            case "B-" -> 2.67;
            case "C+" -> 2.33;
            case "C" -> 2.0;
            case "D" -> 1.0;
            case "F" -> 0.0;
            default -> 0.0;
        };
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() +
               "\nFecha de Nacimiento: " + getFechaNacimiento() +
               "\nID Alumno: " + idAlumno +
               "\nPromedio: " + String.format("%.2f", promCalif) +
               "\nCarrera: " + carrera +
               "\nGrado Obtenido: " + gradoObtenido +
               "\nAño de Graduación: " + anioGraduacion;
    }
}
