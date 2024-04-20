public class Estudiante extends Usuario{

    String carrera;

    public Estudiante(String RUN, String nombreCompleto, char sexo, boolean prestamo) {
        super(RUN, nombreCompleto, sexo, prestamo);
        this.carrera=carrera;

    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
