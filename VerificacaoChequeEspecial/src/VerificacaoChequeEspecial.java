import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double withdraw = sc.nextDouble();
        double overdrawnLimit = 500;

        if (balance > withdraw) {
            System.out.println("Transacao realizada com sucesso.");
        } else if ((withdraw - balance) <= overdrawnLimit) {
            System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
        } else {
            System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
        }

        sc.close();
    }
}
