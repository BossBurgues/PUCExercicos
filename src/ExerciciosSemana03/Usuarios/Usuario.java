package ExerciciosSemana03.Usuarios;

import ExerciciosSemana03.Postagens.Postagem;
import java.util.ArrayList;
import java.util.List;

public class Usuario {

    // Atributos
    private String nome;

    //Usuario cria Postagens. Postagem feita por Usuario.
    //Associação: Ligação/conexão entre classes.
    //Agregação: Usuario tem varias postegens.
    //Composição (Agregação nivel 2) : Postagem pertence a um usuario.
    
    private List<Postagem> listaPostagens;

    //Usuario possui Seguidores
    private List<Usuario> listaSeguidores;

    public String getNome() {
        return this.nome;
    }

    private List<Postagem> getListaPostagens() {
        return this.listaPostagens;
    }


    // Construtor
    public Usuario(String nomeDoUsuario) {
        this.nome = nomeDoUsuario;
        this.listaPostagens = new ArrayList<>();
        this.listaSeguidores = new ArrayList<Usuario>();
    }

    // Métodos
    public boolean criarPostagem() {
        listaPostagens.add(new Postagem());
        return true;
    }

    public void mostrarPostagens() {
        if (listaPostagens.isEmpty()) {
            System.out.println("Lista Vazia!");
            return;
        }

        for (Postagem postagem : listaPostagens) {
            postagem.setCurtidas(-10000);
            postagem.mostrarCurtidas();
        }
    }
}