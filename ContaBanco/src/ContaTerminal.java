import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        String agencia, nome;
        int numero;
        double saldo;

        System.out.println("Ola! Qual o seu nome?");
        nome = sc.nextLine();

        System.out.println("Por favor! Digite o numero de sua Agencia");
        agencia = sc.nextLine();

        System.out.println("Digite o numero de sua conta");
        numero = sc.nextInt();

        System.out.println("Digite o seu saldo");
        saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque \n", nome, agencia, numero, saldo);
    }
}
