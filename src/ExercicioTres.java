import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        System.out.println("Algoritmo para Somar dois numeros e imprimir o resultado!");

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o Primeiro numero:");
        float primeiroNumero=scan.nextFloat();
        System.out.print(primeiroNumero);

        System.out.println("Digite o Segundo numero:");
        float segundoNumero=scan.nextFloat();
        System.out.print(segundoNumero);

        float resultado = primeiroNumero + segundoNumero;

        System.out.println("A soma dos dois numeros é" +resultado);
    }
}
