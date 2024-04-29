import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String accountNumber = null;

        try {

            accountNumber = sc.nextLine();

            verificarNumeroConta(accountNumber);

            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }finally {
            sc.close();
        }
    }
    private static void verificarNumeroConta(String numeroConta) {

        if(numeroConta.length() != 8){
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }
}