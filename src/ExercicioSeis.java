import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        System.out.println("Algoritmo que calcula a area de um cirulo");
        Scanner scan = new Scanner(System.in);
        Float piCalculo= 3.1415f;

        System.out.println("Informe o raio do circulo");
        float raioCirculo = scan.nextFloat();
        System.out.println("O raio do circulo é:" + raioCirculo);

        float calculoRaio= raioCirculo * raioCirculo;
        System.out.print(calculoRaio);
        float calculoFinal= calculoRaio * piCalculo;
        System.out.print(calculoFinal);

        System.out.println("A Area do circulo é:" + calculoFinal);


    }
}
