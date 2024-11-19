package ExerciciosSemana05.Exemplos.Exemplo5;

public class Soma {
    // Overloaded (sobrecarga) de somar(). Esta soma tem 2 parâmetros int;
    // retorno int
    public int somar(int x, int y)
    {
        return (x + y);
    }

    // Overloaded (sobrecarga) de somar(). Esta soma tem 3 parâmetros int;
    // retorno int
    public int somar(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded (sobrecarga) de somar(). Esta soma tem 2 parâmetros double;
    // retorno double
    public double somar(double x, double y)
    {
        return (x + y);
    }

    public static void main(String[] args) {
        Soma s = new Soma();
        System.out.println(s.somar(3, 4));     // invoca somar
        System.out.println(s.somar(3, 4, 5));  // invoca somar
        System.out.println(s.somar(3.4, 5.6)); // invoca somar
    }
}
