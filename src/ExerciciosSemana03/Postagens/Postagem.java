package ExerciciosSemana03.Postagens;

public class Postagem {
    // Atributos
    private int curtidas;

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int novaQuantidadeCurtidas) {
        this.curtidas = validarNumeroCurtidas(novaQuantidadeCurtidas);
    }

    // Construtor
    public Postagem() {
        this.curtidas = 0;
    }

    // Métodos
    public void mostrarCurtidas() {
        System.out.println("Total de curtidas: " + curtidas);
    }

    public void adicionarCurtidas() {
        curtidas += 1;
    }

    private static int validarNumeroCurtidas(int quantidadeParaValidar) {
        if (quantidadeParaValidar < 0) {
            System.out.println("Número de curtidas inválido! Não pode ser negativo!");
            return 0;
        }

        return quantidadeParaValidar;
    }
}