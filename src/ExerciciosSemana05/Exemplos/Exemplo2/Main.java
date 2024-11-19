/* Exemplo de aplicação 2: crie uma superclasse chamada veiculo. Depois, faça os seguintes passos:
Copie os métodos e atributos que são idênticos na classe Carro e Moto para a superclasse Veiculo e altere os construtores das classes Carro e Moto para que usem as implementações da superclasse.
Altere a declaração das classes Moto e Veiculo para incluir a instrução extends Veiculo.
Exclua os métodos idênticos das classes Carro e Moto.
Crie uma terceira classe Onibus.
Adicione a ela os atributos do número de passageiros e se é ou não articulado.
Não esqueça também do metodo imprimir().
Crie alguns ônibus na classe Main.

 */

package ExerciciosSemana05.Exemplos.Exemplo2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var carros = new ArrayList<Carro>();
        var motos = new ArrayList<Moto>();
        var onibus = new ArrayList<Onibus>();

        carros.add(new Carro("Ford Ka", "Zetec Rocam 1.2", 257));
        carros.add(new Carro("Fiat Uno", "Firefly 1.0", 290));

        motos.add(new Moto("Harley Davidson", "Milwaukee-Eight", 1868));
        motos.add(new Moto("Honda Biz", "OHC 4 tempos", 125));

        onibus.add(new Onibus("Mercedes Benz", "V8", 50, true));
        onibus.add(new Onibus("Scania Escolar", "V8", 15, false));

        for (var carro : carros) {
            System.out.println(carro.imprimir());
        }

        for (var moto : motos) {
            System.out.println(moto.imprimir());
        }

        for (var umOnibus : onibus) {
            System.out.println(umOnibus.imprimir());
        }
    }
}

