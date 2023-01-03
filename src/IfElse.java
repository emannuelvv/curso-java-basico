import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("Digite a sua Idade:");
        int idade=scan.nextInt();

        if (idade >=18){
            System.out.println("Voce eh maior de idade");
        }else{
            System.out.println("Voce eh menor de idade");
        }
    }
}
