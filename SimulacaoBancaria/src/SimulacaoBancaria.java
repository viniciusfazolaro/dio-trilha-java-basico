import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0, value = 0; 

        int option = -1;

        do{ 
            value = 0;
            option = sc.nextInt(); 
                
            switch(option) {
            case 1:
                balance += sc.nextDouble();
                System.out.println("Saldo atual: " + balance);
                break;
            case 2:
                value = sc.nextDouble();
                if (balance >= value) {
                    balance -= value;
                    System.out.println("Saldo atual: " + balance);
                } else {
                    System.out.println("Saldo insuficiente.");
                }
                break;
            case 3:
                System.out.println("Saldo atual: " + balance);
                break;
            case 0:
                System.out.println("Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente."); 
            }
        
        } while (option != 0);

        sc.close();
    }
}