public class Docente extends Usuario{

    String profesion;

    String Grado;

    public Docente(String RUN, String nombreCompleto, char genero, boolean prestamo) {
        super(RUN, nombreCompleto, genero, prestamo);
        this.profesion = profesion;
        this.Grado = Grado;

    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String grado) {
        Grado = grado;
    }
}
