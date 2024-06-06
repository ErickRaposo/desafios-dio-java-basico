import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Insira seu nome: ");
        String nome = scn.nextLine();

        System.out.println("Insira a agência: ");
        String agencia = scn.nextLine();

        System.out.println("Insira o número da agência: ");
        int numero = scn.nextInt();

        System.out.println("Insira seu saldo: ");
        double saldo = scn.nextDouble();
        
        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque";
    
        System.out.println(mensagem);
    }
}
