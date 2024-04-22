public class Estudiante extends Usuario{

    String carrera;

    public Estudiante(String RUN, String nombreCompleto, char genero, boolean prestamo) {
        super(RUN, nombreCompleto, genero, prestamo);
        this.carrera=carrera;

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
