/* É possível usar o modificador private antes da palavra-chave class, tanto na classe A quanto na classe B? O que acontece?
R: Não é possível. Gera erro de compilação, pois a classe precisa ser pública ou default (vazio).
 */
/* É possível usar o modificador private nos métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem()? Justifique.
O metodo Postagem.mostrarCurtidas() não pode ter modificador private porque ele é utilizado nos objetos da classe Usuario.
O metodo Usuario.curtirPostagem() poderia ter modificador private porque apenas é utilizado dentro da própria classe Usuario.
 */
/* É possível usar o modificador protected nos métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem()? Justifique
Poderíamos utilizar o modificador protected em ambos os métodos Postagem.mostrarCurtidas() e Usuario.curtirPostagem(),
pois são classes que estão no mesmo pacote e, com esse modificador, os métodos estariam acessíveis entre as classes.
 */