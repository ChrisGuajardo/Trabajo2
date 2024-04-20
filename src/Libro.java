public class Libro {

    String isbn;
    String titulo;
    String autor;
    int cantidadBiblioteca;
    int cantidadDisponible;
    String imagen;

    public Libro(String isbn, String titulo, String autor, int cantidadBiblioteca, int cantidadDisponible, String imagen) {
        this.isbn = isbn; //Codigo libro
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadBiblioteca = cantidadBiblioteca;
        this.cantidadDisponible = cantidadDisponible;
        this.imagen = imagen;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCantidadBiblioteca() {
        return cantidadBiblioteca;
    }

    public void setCantidadBiblioteca(int cantidadBiblioteca) {
        this.cantidadBiblioteca = cantidadBiblioteca;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}

