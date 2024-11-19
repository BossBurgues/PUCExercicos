package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;
import java.time.Year; // Imoportar anos

/* Crie um algoritmo em Java que peça ao usuário para que se digite um ano (exemplo: 2032).
Em seguida, o algoritmo deve verificar se o ano informado é ou não bissexto.
 */

public class Quinto {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        int ano = scanner.nextInt();
        boolean anobi = Year.isLeap(ano); //Concatenar uma atribuição ao boolean, usando Year.isleap para puxar a biblioteca de anos e saber quais são bissextos ou não.
        if (anobi) {
            System.out.println(ano + " É Bissexto");
        } else {
            System.out.println(ano + " Não é Bissexto");
        }
    }
}
