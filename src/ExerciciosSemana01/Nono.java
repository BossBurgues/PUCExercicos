package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;

/*Crie um algoritmo em Java que solicita ao usuário para que insira um número inteiro
entre 1 e 1000 e converta-o em um número romano.
Por exemplo, se o usuário inserir 58, o programa deve imprimir "LVIII".
 */
public class Nono {
    public static void main(String [] args) {
        Locale.setDefault(new Locale("pt", "br"));
        Scanner scanner = new Scanner(System.in);

//Entrada dos dados;
        System.out.print("Digite um número inteiro entre 1 e 1000: ");

        //valor de numeros;
        int[] vaNum = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

//valor de numeros romanos;
        String[] vaRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//Tratamento para conversão dos dados de entrada para números romanos;
        while (true) {

            int numero = scanner.nextInt();
            if (numero == 0) break;
            System.out.printf("%-4d ", numero);
            int i = 0;
            while (numero > 0) {
                if (numero >= vaNum[i]) {
                    System.out.print(vaRom[i]);
                    numero -= vaNum[i];
                } else {
                    i++;
                }
            }
            System.out.println();
        }
    }
}