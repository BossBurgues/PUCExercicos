package ExerciciosSemana03.ExerciciosSemana03PDF;

public class StringExamples {

    public static void main(String[] args) {
        String txt;

        txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Comprimento de [" + txt + "] = " + txt.length());

        txt = "Olá Mundo!";
        System.out.println(txt.toUpperCase());   // Saída = "OLÁ MUNDO!"
        System.out.println(txt.toLowerCase());   // Saída = "olá mundo"

        txt = "Localize a posição da palavra 'eureka' neste texto!";
        System.out.println(txt.indexOf("eureka")); // Saída = 31
    }
}