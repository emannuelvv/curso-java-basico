import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in); //Lendo os dados do teclado

        //Ler a linha toda
        System.out.println("Digite seu Nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo eh?"+nomeCompleto);

        //Lendo apenas a primeira palavra
        System.out.println("Digite Seu Primeiro Nome:");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome eh:"+primeiroNome);

        //Lendo int para idade
        System.out.println("Digite sua idade:");
        int idade =scan.nextInt();
        System.out.println("Sua Idade eh:"+idade);

        //Altura com Double
        System.out.println("Digite sua Altura:");
        double altura =scan.nextDouble();
        System.out.println("Sua altura eh:"+altura);

        //Multiplos dados
        System.out.println("Digite o seu primeiro Nome,idade,quantidade de filhos e se tem gatos:");
        String nomeInicial = scan.next();
        int idadeDados = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        boolean gatinhos = scan.nextBoolean();
        System.out.println("Seu Nome eh:" +nomeInicial);
        System.out.println("Seu idade eh:" +idadeDados);
        System.out.println("Quantidade de filhos eh:" +qtdFilhos);
        System.out.println("Voce tem gastos?" +gatinhos);

    }
}
