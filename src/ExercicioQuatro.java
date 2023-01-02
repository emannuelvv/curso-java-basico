import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        System.out.print("Algoritmo para fazer a media de 4 notas de alunos");

        Scanner scan= new Scanner(System.in);
        System.out.println("Digite a Primeira nota do semestre:");
        float primeiraNota = scan.nextFloat();
        System.out.print(primeiraNota);

        System.out.println("Digite a Segunda nota do semestre");
        float segundaNota = scan.nextFloat();
        System.out.println(segundaNota);

        System.out.println("Digite a terceira nota do semestre");
        float terceiraNota= scan.nextFloat();
        System.out.println(terceiraNota);

        System.out.println("Digite a quarta e ultima nota do semestre");
        float quartaNota= scan.nextFloat();
        System.out.println(quartaNota);

        float mediaNotas= primeiraNota+segundaNota+terceiraNota+quartaNota;
        float resultadoMedias= mediaNotas /4;

        System.out.println("A média das suas notas são:" +resultadoMedias);
    }
}
