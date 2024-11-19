package ExerciciosSemana01;
import java.util.Locale;
import java.util.Scanner;

/* Crie um algoritmo em Java que mostre na tela todos
os múltiplos de 3 entre os números 0 e 30 usando a estrutura “do while”.
*/

public class Terceiro {
    public static void main(String[] arg) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);
        int M = 0;

        //Criar regra para multiplos

        do {
            System.out.println("Multiplos de 3: " + M);
            M += 3; // Tratamento de multiplo de 3

        } while (M <= 30 );

    }

}

