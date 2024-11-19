package ExerciciosSemana03.ExerciciosSemana03PDF;

public class Automovel {
    public String marca;
    protected String modelo;
    private String placa;

    public Automovel(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }

    public String getPlaca() {
        return this.placa;
    }
}