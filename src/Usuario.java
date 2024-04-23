public class Usuario {

    private String nombreCompleto;
    private String RUN;

    private char genero;

    private boolean prestamo;

    public Usuario() {
    }

    public Usuario(String RUN, String nombreCompleto, char genero, boolean prestamo) {
        this.RUN = RUN;
        this.nombreCompleto = nombreCompleto;
        this.genero = genero;
        this.prestamo = prestamo;

    }

    public void validarRUN(){

    }
    public void validargenero(){

    }

    public String getRUN() {
        return RUN;
    }

    public void setRUN(String RUN) {
        this.RUN = RUN;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
}
