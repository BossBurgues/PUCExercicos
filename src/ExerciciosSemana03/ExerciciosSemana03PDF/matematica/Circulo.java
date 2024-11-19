package ExerciciosSemana03.ExerciciosSemana03PDF.matematica;

public class Circulo {
    private static double PI = 3.141516;
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double area(){
        return PI * raio * raio ;
    }

    public double perimetro (){
        return 2 * PI * raio;
    }
}