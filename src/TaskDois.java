import java.util.Scanner;

public class TaskDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor positivo ou negativo");

        float valorUm = scan.nextFloat();
        System.out.println(valorUm);

        if (valorUm >0){
        System.out.println("Esse valor eh positivo");
    }else{
            System.out.println("Esse valor eh negativo");
        }
    }
}
