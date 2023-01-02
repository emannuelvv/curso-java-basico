import java.util.Scanner;

public class ExercicioOito {
    public static void main(String[] args) {
        System.out.println("Calculadora para suas horas trabalhadas!!");
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto vale sua hora:");
        Float valorHora = scan.nextFloat();
        System.out.println("Seu valor por hora é: " +valorHora);

        System.out.println("Digite o Valor de horas trabalhadas esse Mês:");
        int diasTrabalhados = scan.nextInt();
        System.out.println("Você trabalhou " +diasTrabalhados +"esse mês!!");

        Float salarioMensal= valorHora * diasTrabalhados;
        System.out.println("Seu salario desse mês é:" + salarioMensal);
        System.out.println("Sua hora vale:" + valorHora);
        System.out.println("Você trabalhou " +diasTrabalhados+ "horas esse mês");
    }
}
