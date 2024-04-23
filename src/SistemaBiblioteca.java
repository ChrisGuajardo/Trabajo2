public class SistemaBiblioteca {

        public void agregarUsuario(Usuario usuario) {              //agregar un nuevo usuario
        }

        public void eliminarUsuario(String id) {                   // eliminar un usuario por ID
        }

        public Usuario buscarUsuario(String id) {                 //buscar un usuario por ID
            return null;                                          // retornar el usuario encontrado
        }
       /* boolean validarUsuario(Usuario usuario) {
            boolean validacion;

            if () {


                else{
            }

        */


        public void agregarLibro(Libro libro) {                   // agregar un nuevo libro
        }

        public void eliminarLibro(String codigo) {               // eliminar un libro por código
        }

        public boolean prestarLibro(String usuarioId, String libroCodigo) {               //solicitar un préstamo de libro
            return false;                                                                 // retornar true si el préstamo es exitoso
        }

        public boolean devolverLibro(String usuarioId, String libroCodigo) {           //devolver un préstamo de libro
            return false;                                                                // retornar true si la devolución es exitosa
        }
    }




