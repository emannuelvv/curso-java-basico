import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        System.out.println("Vamos fazer a conversão de Metros para Centrimetros");
        Scanner scan=new Scanner(System.in);

        System.out.println("Digite o valor em Metros");
        float valorMetros=scan.nextFloat();
        System.out.println("Você tem "+valorMetros +"em Metros");

        float fazendoConversao= valorMetros *100;
        float valorEmCentimetros= fazendoConversao;

        System.out.println("O Valor em centrimetros é:" + valorEmCentimetros);
    }
}
