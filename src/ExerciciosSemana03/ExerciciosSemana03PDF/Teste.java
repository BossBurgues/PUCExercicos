package ExerciciosSemana03.ExerciciosSemana03PDF;

public class Teste {
    public static void main(String[] args) {
        Automovel auto = new Automovel("Chevrolet", "Onix", "ABC1234");

        System.out.println("Marca: " + auto.marca); // Acessível porque é public
        System.out.println("Modelo: " + auto.modelo); // Acessível porque é protected
        // System.out.println("Placa: " + auto.placa); // Erro! Não temos acesso ao atributo placa diretamente porque ele é privado
        System.out.println("Placa: " + auto.getPlaca()); // Acessível através do método público getPlaca
    }
}