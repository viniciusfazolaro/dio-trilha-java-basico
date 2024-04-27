import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int accountNumber = 0;
        String agency = "";
        String customerName = "";
        double balance = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do Cliente: ");
        customerName = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência: ");
        agency = sc.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        accountNumber = sc.nextInt();

        System.out.print("Por favor, digite o Saldo: ");
        balance = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + customerName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + ", conta " + accountNumber + " e seu saldo " + balance + " já está disponível para saque");
    }
}
