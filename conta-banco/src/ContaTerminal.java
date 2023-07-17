import java.util.Scanner;
import java.util.Locale;

/**
 * <h1>ContaBanco
 * <h1>
 * O programa recebe informações do usúario
 * e faz a abertura de uma conta bancária
 * <p>
 * 
 * @author VICTOR RODRIGUES SILVA
 * @version 1.0
 * @since 16/07/2023
 */
public class ContaTerminal {
    /*
     * Este método é utilizado para abertura de conta
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome :");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência :");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta :");
        int numero = scanner.nextInt();

        System.out.println(
                "Para a abertura da conta, Insira um valor (O VALOR DEPOSITADO PODERÁ SER SACADO POSTERIORMENTE!) :");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
