import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Modo feio e horrivel de fazer sem o switch case
        System.out.println("Digite o numero correspondente ao dia da semana");
        int diasSemana= scan.nextInt();

        if (diasSemana==1){
            System.out.println("Domingo");
        } else if (diasSemana ==2) {
            System.out.println("Segunda");
        } else if (diasSemana ==3) {
            System.out.println("Terca");
        } else if (diasSemana ==4) {
            System.out.println("Quarta");
        } else if (diasSemana ==5) {
            System.out.println("Quinta");
        } else if (diasSemana ==6) {
            System.out.println("Sexta");
        } else if (diasSemana ==7) {
            System.out.println("Sabado");
        }else{
            System.out.println("Nao e um dia da semana valido apenas numeros 1-7");
        }

        //Modo mais simples de fazer com o Switch case
        switch (diasSemana){
            case 1:System.out.println("Domingo");break;//break usado como um parentes
            case 2:System.out.println("Segunda");break;
            case 3:System.out.println("Terca");break;
            case 4:System.out.println("Quarta");break;
            case 5:System.out.println("Quinta");break;
            case 6:System.out.println("Sexta");break;
            case 7:System.out.println("Sabado");break;
            default:System.out.println("Nao e um dia da semana valido apenas numeros 1-7");
        }
    }
}
