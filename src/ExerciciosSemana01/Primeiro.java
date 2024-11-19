package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;

/* 1. Crie um algoritmo em Java que solicita três números decimais ao usuário.
Em seguida, a média destes números é calculada e mostrada na tela para o usuário.
 */

public class Primeiro {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        float numero1 = scanner.nextFloat();

        System.out.print("Digite o segundo numero: ");
        float numero2 = scanner.nextFloat();

        System.out.print("Digite o terceiro numero: ");
        float numero3 = scanner.nextFloat();

        System.out.println("A média é: " + (numero1 + numero2 + numero3) / 3 );

        scanner.close();

    }
}
