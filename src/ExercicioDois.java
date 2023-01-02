import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Digite um numero para meu algoritmo imprimir na tela:");
        int numeroNaTela = scan.nextInt();
        System.out.println("O número que você digitou foi" + numeroNaTela);
    }
}
