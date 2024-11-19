package ExerciciosSemana05.ExemploVideo;

public class Main {
    public static void main(String [] args) {
        Veiculo carroDoVizinho = new Veiculo("Peugeot", "1.6 THP");
        Veiculo nossoCaminhao = new Caminhao("Volvo", "Diesel 3.4 Turbo", 4, 20);

        //System.out.println("O carro do vizinho é um: "+ carroDoVizinho.getMarca() + " com motor " + carroDoVizinho.getMotor());
        //System.out.println("O Nosso caminhão é um: "+ nossoCaminhao.getMarca() + " com motor " + nossoCaminhao.getMotor());

        carroDoVizinho.getDetalhes();
        nossoCaminhao.getDetalhes();

        carroDoVizinho.getSom();
        nossoCaminhao.getSom();

    }
}
