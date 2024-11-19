package ExerciciosSemana01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Forca {
    private String palavraSecreta;
    private StringBuilder palavraAtual;
    private int tentativasRestantes;
    private ArrayList<Character> letrasTentadas;

    public Forca(String palavra, int tentativas) {
        this.palavraSecreta = palavra.toUpperCase();
        this.palavraAtual = new StringBuilder("_".repeat(palavra.length()));
        this.tentativasRestantes = tentativas;
        this.letrasTentadas = new ArrayList<>();
    }

    public boolean tentarLetra(char letra) {
        letra = Character.toUpperCase(letra);

        if (letrasTentadas.contains(letra)) {
            System.out.println("Você já tentou essa letra.");
            return false;
        }

        letrasTentadas.add(letra);

        if (palavraSecreta.indexOf(letra) != -1) {
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraAtual.setCharAt(i, letra);
                }
            }
            return true;
        } else {
            tentativasRestantes--;
            return false;
        }
    }

    public boolean venceu() {
        return palavraAtual.toString().equals(palavraSecreta);
    }

    public boolean perdeu() {
        return tentativasRestantes <= 0;
    }

    public void exibirEstado() {
        System.out.println("Palavra: " + palavraAtual);
        System.out.println("Tentativas restantes: " + tentativasRestantes);
        System.out.println("Letras tentadas: " + letrasTentadas);
    }
}

public class JogoDaForca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] listaDePalavras = {"java", "computador", "programacao", "teclado", "monitor"};
        Random random = new Random();
        String palavraEscolhida = listaDePalavras[random.nextInt(listaDePalavras.length)];

        Forca jogo = new Forca(palavraEscolhida, 6); // Palavra escolhida com 6 tentativas

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Você tem 6 tentativas para adivinhar a palavra.");
        System.out.println();

        while (!jogo.venceu() && !jogo.perdeu()) {
            jogo.exibirEstado();
            System.out.print("Digite uma letra: ");
            char letra = scanner.nextLine().charAt(0);

            if (jogo.tentarLetra(letra)) {
                System.out.println("Você acertou uma letra!");
            } else {
                System.out.println("Você errou.");
            }

            System.out.println();
        }

        if (jogo.venceu()) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavraEscolhida);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraEscolhida);
        }

        scanner.close();
    }
}