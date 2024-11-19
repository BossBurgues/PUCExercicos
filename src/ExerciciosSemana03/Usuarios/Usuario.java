package ExerciciosSemana03.Usuarios;

import ExerciciosSemana03.Postagens.Postagem;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // Atributos
    private String nome;
    private List<Postagem> listaPostagens;

    public String getNome() {
        return this.nome;
    }

    public List<Postagem> getListaPostagens() {
        return this.listaPostagens;
    }

    // Construtor
    public Usuario(String nomeDoUsuario) {
        this.nome = nomeDoUsuario;
        this.listaPostagens = new ArrayList<>();
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