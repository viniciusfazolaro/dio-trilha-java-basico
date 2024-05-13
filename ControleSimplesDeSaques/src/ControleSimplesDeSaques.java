import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double dailyLimit = sc.nextDouble();
        double withdrawValue = 0;
        
        for(int i = 0; i < 100; i++) {
            withdrawValue = sc.nextDouble();

            if (withdrawValue == 0) break;
            else if (dailyLimit >= withdrawValue ) {
                dailyLimit -= withdrawValue;
                System.out.println("Saque realizado. Limite restante: " + dailyLimit);
            } else if (withdrawValue > dailyLimit) {
                System.out.print("Limite diario de saque atingido. ");
                break;
            }
        }

        System.out.println("Transacoes encerradas.");

        sc.close();
    }
}