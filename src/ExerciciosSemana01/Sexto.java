package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;

/*Crie um algoritmo em Java que solicita um número inteiro ao usuário.
Em seguida, deve-se verificar se o número digitado é ou não é um número primo.
*/

public class Sexto {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        boolean primo = true; // Definição para o parametro booleano

        if (numero <= 1) { //Definição de true/false
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) { //Defenir uma regra para aatribuição do true/false
                if (numero % i == 0) {
                    primo = false;
                    break;
                }
            }
        }
        // Printar resultados

        if (primo) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }

        scanner.close();
    }
}
