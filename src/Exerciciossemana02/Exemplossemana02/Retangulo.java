package Exerciciossemana02.Exemplossemana02;

public class Retangulo {
    // Atributos da classe = ESTADO da classe
    float altura;
    float largura;

    public Retangulo (float alt, float larg) { // Define o metodo construtor
        altura = alt;
        largura = larg;
    }
    // Métodos da classe = COMPORTAMENTO da classe
    float calcularPerimetro() {
        float pm;                 // variável local
        pm = 2 * altura + 2 * largura;
        return pm;
    }
    void imprimirDados() {
        float p;                   // variável local
        p = calcularPerimetro();   // calcula o perímetro do retângulo
        System.out.println("Retângulo: ");
        System.out.println("- altura:    " + altura);
        System.out.println("- largura:   " + largura);
        System.out.println("- perimetro: " + p);
    }
    // Metodo principal - início de execução do programa
    public static void main(String[] args) {
        System.out.println("Mundo dos retângulos");

        // Objeto de Retangulo retg1
        Retangulo retg1;         // referência de objeto da classe Retangulo
        retg1 = new Retangulo(10, 20); // instanciação da classe
        retg1.imprimirDados();   // invocação de metodo do objeto

        // Objeto de Retangulo retg2
        Retangulo retg2;         // referência de objeto da classe Retangulo
        retg2 = new Retangulo(5, 15); //instanciação
        retg2.imprimirDados();   // invocação de metodo do objeto
    }
}