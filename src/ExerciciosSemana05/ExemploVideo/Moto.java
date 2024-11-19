package ExerciciosSemana05.ExemploVideo;

public class Moto extends Veiculo {

    //Atributos

    public String marca;
    public int cilindradas;


    //Construtor

    Moto(String marcaDaMoto, String motorDaMoto, int cilindradas) {
        super(marcaDaMoto, motorDaMoto);
        this.marca = marcaDaMoto;
        this.cilindradas = cilindradas;

    }

    //Metodos

    public int getCilindradas() {
        return this.cilindradas;
    }
}
