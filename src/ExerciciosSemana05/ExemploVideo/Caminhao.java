package ExerciciosSemana05.ExemploVideo;

public class Caminhao extends Veiculo {

    //Atributos

    private int numeroDeEixos;
    private int capacidadeEmToneladas;

    //Construtor

    Caminhao(String marcaDoCaminhao, String motorDoCaminhao, int numEixosCaminhao, int capacidadeToneladas) {
        super(marcaDoCaminhao, motorDoCaminhao); //Chame o construtor do veiculo
        this.marca = marcaDoCaminhao;
        this.numeroDeEixos = numEixosCaminhao;
        this.capacidadeEmToneladas = capacidadeToneladas;
    }

    //Metodos

    public int getNumeroEixos() {
        return this.numeroDeEixos;
    }

    public int getCapacidadeEmToneladas() {
        return this.capacidadeEmToneladas;
    }

    // Override: sobrescrita de métodos
    public void getDetalhes() {
        super.getDetalhes();
        System.out.println("O nosso caminhão tem uma capacidade de " + getCapacidadeEmToneladas() + " toneladas.");
    }

    // Overload: sobrecarga de métodos

    public void getdetalhes(Boolean mostrarEixos) {
        if (mostrarEixos) {
            System.out.println("O caminhão tem " + getNumeroEixos() + " eixos ");
        } else {
            System.out.println("Não mostrar nada sobre os eixos.");
        }
    }

    public void getDetalhes(int quantidadeLinhasEmBranco) {
        for (int i = 0; i < quantidadeLinhasEmBranco; i++) {
            System.out.println();
        }
        super.getDetalhes();
    }

    public void getSom(){
        System.out.println("Os caminhões são barulhentos");
    }
}
