import java.util.Scanner;

public class TaskUm {
    public static void main(String[] args) {
        //Faca um programa que peca dois numeros e imprima o numero maior

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite dois numeros que eu vou escrever qual eh o maior:");
        int valorUm = scan.nextInt();
        int valorDois = scan.nextInt();
        System.out.println(valorUm);
        System.out.println(valorDois);

        if (valorUm >= valorDois){
            System.out.println("O Maior valor eh"+valorUm);
        }else{
            System.out.println("O Maior valor eh"+valorDois);
        }
    }
}
