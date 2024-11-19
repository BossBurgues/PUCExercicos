

package ExerciciosSemana05.ExemploVideo;

public class Veiculo {

    //Atibutos

    protected String marca;
    protected String motor;

    //Construtor

    public Veiculo(String marcaDoVeiculo, String motorDoVeiculo) {
        this.marca = marcaDoVeiculo;
        this.motor = motorDoVeiculo;
    }

    //Metodos

    public String getMarca() {
        return this.marca;
    }

    public String getMotor() {
        return this.motor;
    }

    public void getDetalhes(){
        System.out.println("A marca do veiculo é " + getMarca() + " e o motor é " + getMotor());
    }

    public void getSom(){
        System.out.println("Os veiculos podem ser barulhentos ou silenciosos");
    }
}
