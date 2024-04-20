public class Usuario {

    private String nombreCompleto;
    private String RUN;

    private char sexo;

    private boolean prestamo;

    public Usuario(String RUN, String nombreCompleto, char sexo, boolean prestamo) {
        this.RUN = RUN;
        this.nombreCompleto = nombreCompleto;
        this.sexo = sexo;
        this.prestamo = prestamo;

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }
}
