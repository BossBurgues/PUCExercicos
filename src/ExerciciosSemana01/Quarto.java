package ExerciciosSemana01;
import java.util.Locale;
import java.util.Scanner;

/*Crie um algoritmo em Java que peça ao usuário para que se digite
um número inteiro (exemplo: 14). Em seguida, o algoritmo deve
mostrar a tabuada do número digitado utilizando o “for”.
*/

public class Quarto {
     public static void main(String[] args) {
         Locale.setDefault(new Locale("pt", "BR"));
         Scanner scanner = new Scanner(System.in);

         // Tratamento para inserir um número

         System.out.print("Digite um número inteiro: ");
         int num = scanner.nextInt();

         // Tratamento para definir a tabuada

         for (int i = num; i <= num * 10; i += num) { // Regra de atribuição de calculo.
             System.out.println("Tabuada do " + num + " : " + i);

         scanner.close();
         }

     }

}
