package ExerciciosSemana03;
import ExerciciosSemana03.Usuarios.Usuario;

public class main {
    public static void main(String[] args) {
        Usuario primeiroUsuario = new Usuario("Fulano");
        primeiroUsuario.mostrarPostagens();

        primeiroUsuario.criarPostagem();
        primeiroUsuario.mostrarPostagens();

        System.out.println(primeiroUsuario.getNome());
    }
}