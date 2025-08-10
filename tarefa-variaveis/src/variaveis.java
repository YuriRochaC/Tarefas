import java.util.Scanner;

public class variaveis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo! \nPreciso de alguns dados seus:");

        System.out.println("seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("seu cpf: ");
        String cpf = sc.nextLine();

        System.out.println("sua idade: ");
        int idade = sc.nextInt();

        System.out.println("seu peso: ");
        double peso = sc.nextDouble();

        System.out.println("sua altura: ");
        float altura = sc.nextFloat();

        sc.nextLine();

        System.out.println("seu estado civil: ");
        String estCivil = sc.nextLine();


        System.out.println("seu nome: " + nome);
        System.out.println("seu cpf: " + cpf);
        System.out.println("sua idade: " + idade);
        System.out.println("seu peso: " + peso);
        System.out.println("sua altura: " + altura);
        System.out.println("seu estado civil: " + estCivil);

        sc.close();

    }
}

