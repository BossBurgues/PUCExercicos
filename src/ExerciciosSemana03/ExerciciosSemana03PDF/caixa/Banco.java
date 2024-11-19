package ExerciciosSemana03.ExerciciosSemana03PDF.caixa;

/* public class Banco {
    public static void main(String[] args) {
        Cria objetos da classe Conta
        Conta cta1 = new Conta();
        Conta cta2 = new Conta();

        código para alterar o saldo da cta1
        código para alterar o nome do dono da cta1

        código para alterar o saldo da cta2
        código para alterar o nome do dono da cta2

        System.out.println("Cta 1 - Correntista: " + "XXXX");
        System.out.println("Cta 1 - Saldo: " + "XXXX");

        System.out.println("Cta 2 - Correntista: " + "XXXX");
        System.out.println("Cta 2 - Saldo: " + "XXXX");
    }
}

 */
public class Banco {
    public static void main(String[] args) {
        // Cria objetos da classe Conta
        Conta cta1 = new Conta();
        Conta cta2 = new Conta();

        cta1.setSaldo(1000.50);
        cta1.setDono("Fulano de Tal");

        cta2.setSaldo(5555.99);
        cta2.setDono("Beltrano da Silva");

        System.out.println("Cta 1 - Correntista: " + cta1.getDono());
        System.out.println("Cta 1 - Saldo: " + cta1.getSaldo());

        System.out.println("Cta 2 - Correntista: " + cta2.getDono());
        System.out.println("Cta 2 - Saldo: " + cta2.getSaldo());
    }
}