package ExerciciosSemana01;
import java.util.Scanner;
import java.util.Locale;

/*Crie um algoritmo em Java que peça ao usuário a temperatura em graus Celsius
e converta-a para graus Fahrenheit. Além disso, o programa deve imprimir
se está frio (abaixo de 32°F), moderado (entre 32°F e 80°F) ou quente (acima de 80°F).
*/
// Definição dos imports + preparação do código

public class Setimo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

// Definição da inserção da temperatura + formula de conversão

        System.out.print("Insira a temperatura desejada em Graus Celsius: ");
        float temp = scanner.nextFloat();
        float conv = temp * 9/5 + 32;

        // Parametros de inserção das regras e execssoes para a temperatura.

        if (conv <= 32 ) {
            System.out.printf("A temperatura em (Fahrenheit) está negativa: %.2f", conv);
        } else if (conv >= 32 && conv <= 80) {
            System.out.printf("A temperatura em (Fahrenheit) está moderada: %.2f", conv);
        } else {
            System.out.printf("A temperatura em (Fahrenheit) está quente: %.2f", conv);

        }

        scanner.close();

    }
}
