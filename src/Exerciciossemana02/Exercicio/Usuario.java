package Exerciciossemana02.Exercicio;

/*Nível fácil

1. Desenvolva um projeto em Java contendo somente um arquivo: Usuario.java. Esse arquivo deve conter uma classe chamada Usuario,
que representa um usuário da Netflix. Essa classe precisa de três atributos (nome do usuário, e-mail e senha), somente.

2. Modifique o exercício anterior para que ele contenha dois métodos (um para mostrar na tela o nome e e-mail do usuário,
e outro para verificar se uma determinada senha informada é igual à senha cadastrada pelo usuário).
Além disso, inclua um metodo construtor para aceitar três parâmetros: o e-mail, a senha e o nome do usuário.

3. Modifique o exercício anterior para instanciar um objeto para a classe Usuario, representando um usuário com o nome
de “João”, e-mail “joao@exemplo.com”, e senha “senhaSegura123”. Chame o metodo “verificarSenha” duas vezes:
uma utilizando a senha correta (“senhaSegura123”) e outra utilizando uma senha incorreta (exemplo: “senhaSegura000”).

Nível médio

4. Modifique o exercício anterior para adicionar um novo arquivo no projeto com o nome de Episodio.java.
Este arquivo deve conter uma classe chamada Episodio, o qual possui três atributos (título e duração),
e um metodo que mostra na tela esses dois atributos. Instancie cinco objetos desta classe.

Nível difícil

5. Modifique o exercício anterior para adicionar um novo arquivo no projeto com o nome de Serie.java.
Este arquivo deve conter uma classe chamada Serie, o qual possui dois atributos: o nome da série e uma lista de
episódios (objetos do tipo Episodio que criamos no exercício anterior). Esta classe precisa de um metodo que mostre na tela os dados da Série.

Desafio

6. Modifique o arquivo Usuario.java. Agora, a classe Usuario precisa de um novo atributo chamado seriesAssistidas.
Ele deve ser uma lista de séries que o usuário já assistiu. Também, adicione um metodo chamado “adicionarSerieAoHistorico”
para que consigamos adicionar novas séries ao histórico do usuário. Finalmente, modifique o metodo encarregado por
mostrar as informações do usuário para que mostre também as séries que ele assistiu.

 */

 public class Usuario {
    // Atibutos de classe = usuário netflix
    private String nome;
    private String email;
    private String senha;

    // Metodo construtor
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

     // Metodos para os dados
     public void dadosUsuario() {
        System.out.println("Usuario: " + nome);
        System.out.println("E-mail : " + email);
     }

     //Metodo para a senha
     public boolean verificarSenha(String senhaInformada) {
        return this.senha.equals(senhaInformada);
     }

     //Metodo de teste da classe
     public static void main(String[] args) {

         //Objeto da classe
         Usuario usuario = new Usuario("João", "joão@gmail", "senhaSegura123");

         //Mostrar os dados
         usuario.dadosUsuario();

         // Testar a verificação da senha
         String senhaParaTeste = "senhaSegura123";
         if (usuario.verificarSenha(senhaParaTeste)) {
             System.out.println("Senha correta!");
         } else {
             System.out.println("Senha incorreta!");
         }
     }
 }


