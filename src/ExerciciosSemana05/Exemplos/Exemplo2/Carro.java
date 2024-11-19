package ExerciciosSemana05.Exemplos.Exemplo2;

public class Carro extends Veiculo {
    private int portaMalas;

    public Carro(String marca, String motor, int portaMalas) {
        super(marca, motor);
        this.portaMalas = portaMalas;
    }

    public int getPortaMalas() {
        return portaMalas;
    }

    public String imprimir() {
        return "Marca: " + getMarca() + ", Motor: " + getMotor() +
                " Porta malas: " + getPortaMalas() + " litros.";
    }
}