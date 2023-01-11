import java.util.Scanner;

public class TaskTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a letra M ou F");

        String valorDigitado = scan.next();
        System.out.println("Voce digitou"+valorDigitado);

        if (valorDigitado.equals("M")){
            System.out.println("Voce eh do sexo masculino");
        }else if (valorDigitado.equals("F")) {
            System.out.println("Voce eh do sexo feminino");
        }else{
            System.out.println("Sexo Invalido");
        }
    }
}
