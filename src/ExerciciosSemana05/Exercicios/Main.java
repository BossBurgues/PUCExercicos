/* Suponha que você esteja projetando o sistema de back-end para um aplicativo de comércio eletrônico como a Amazon.
Crie uma classe genérica chamada produto que contenha informações que todos os produtos têm em comum (como idProduto, nome, preco).
Agora, crie classes especializadas como livro, eletronico e roupa, cada uma com atributos adicionais relevantes para esse tipo de produto.

Crie uma classe ContaBancaria com atributos privados como saldo e numeroDaConta.
Crie uma classe ContaCorrente que herda de ContaBancaria e adiciona um atributo limiteDeCredito.
Certifique-se de usar protected ou private corretamente para encapsular os atributos.

Vamos pensar no Airbnb. Crie uma classe-base acomodacao que possui um metodo precoPorNoite().
Agora crie subclasses casa e apartamento que sobrescrevem esse metodo para fornecer preços diferentes por noite.
Para o Uber, crie uma classe viagem com um metodo calcularPreco().
Sobrecarregue esse metodo para aceitar diferentes conjuntos de parâmetros.
Por exemplo, um metodo que aceita apenas a distância da viagem, outro que aceita distância e horário (porque o preço pode variar dependendo da hora do dia).

Você está no processo seletivo de estágios do Spotify. Para isso, crie uma classe midia com um metodo play().
Agora crie classes musica e podcast que herdam de midia e implementam o metodo play() de maneiras diferentes.
Em uma classe playlist, você pode ter um ArrayList de midia, permitindo que você chame o metodo play() em qualquer item da playlist, seja ele uma música ou podcast.

Você está no processo seletivo d’O Boticário. Nele, você recebeu o seguinte problema:
você tem uma classe produto e subclasses como perfume e maquiagem.
Em uma classe CarrinhoDeCompras, você tem uma lista de produto.
Em um determinado momento, você quer tratar um produto em seu carrinho
como perfume para acessar métodos específicos dessa subclasse.
Demonstre como você pode usar typecasting para fazer isso de maneira segura.
 */

package ExerciciosSemana05.Exercicios;

public class Main {
}
