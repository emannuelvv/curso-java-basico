import java.util.Scanner;

public class IfElseCompra {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        //barato <=10
        //10< valor <15 - pedir um desconto
        //15<= valor 17 - pesquisar mais
        //>=17 muito caro

        System.out.println("Digite o valor do produto");
        double valor= scan.nextDouble();

        if (valor <=10){
            System.out.println("Irei comprar");
        } else if (valor >10 && valor <15) {
            System.out.println("Voce tem um desconto para esse valor?");
        } else if (valor >=15 && valor <=17) {
            System.out.println("Vou dar uma pensada");
        }else{
            System.out.println("Nao irei comprar obrigado");
        }


    }
}
