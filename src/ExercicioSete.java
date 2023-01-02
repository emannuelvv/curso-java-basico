import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        System.out.println("Algoritmo para descobriar a area de um quadrado");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Lado do quadrado:");
        Float ladoQuadrado= scan.nextFloat();
        System.out.println("O valor do lado do seu quadrado é :"+ladoQuadrado);

        Float calculoArea = ladoQuadrado * ladoQuadrado;
        System.out.println("A area do seu quadrado é " + calculoArea);

        Float dobroArea = calculoArea *calculoArea;
        System.out.println("O dobro da area do nosso quadrado é " + dobroArea);
    }
}
