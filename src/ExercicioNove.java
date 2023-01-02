import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        System.out.println("Conversou de temperatura");
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos graus em Farenheit está no exato momento?");
        Float grausAgora= scan.nextFloat();
        System.out.println("A temperatura agora é de " +grausAgora + "Farenheit");

        Float temperaturaCelsius=(5*(grausAgora -32)/9);
        System.out.println(temperaturaCelsius);
    }
}
