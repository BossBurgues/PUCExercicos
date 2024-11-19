package ExerciciosSemana05.Exemplos.Exemplo1;

public class Carro {
    private String marca;
    private String motor;
    private int portaMalas;

    public Carro(String marca, String motor, int portaMalas) {
        this.marca = marca;
        this.motor = motor;
        this.portaMalas = portaMalas;
    }

    public String getMarca() {
        return marca;
    }

    public String getMotor() {
        return motor;
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() +
                " Porta-malas: " + getPortaMalas() + " litros.";
    }
}