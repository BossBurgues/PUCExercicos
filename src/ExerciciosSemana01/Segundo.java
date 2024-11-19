package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;

/*Crie um algoritmo em Java que verifica se um
número inteiro é positivo, negativo ou zero.
*/

public class Segundo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR")); //Tratamento para definir classes, numeros, e sinais em pt-br.
        Scanner scanner = new Scanner(System.in); //Tratemnto para inserir dados(input) como no python.

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt(); //Tratamento de numero inteiro.

        if (numero < 0) {
            System.out.println("O numero é negativo! "); //Tratamento de numero negativo.
        } else if (numero > 0) {
            System.out.println("O numero é positivo! "); // Tratamento de numero positivo.
        } else {
                System.out.println("O numero é zero! "); //Tratamento para numero = a zero.

        scanner.close(); //Fechar o Scanner/leitura de programa.

        }
    }
}
