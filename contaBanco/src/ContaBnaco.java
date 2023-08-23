
import java.util.Scanner; 
public class ContaBnaco {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Seja bem vindo");
            System.out.println("Digite seus dados abaixo para criar uma conta:");

   
            System.out.println("Digite seu nome: ");
            String nomeCliente =  scanner.nextLine();

            System.out.println("Digite o numero da sua agência: ");
            String agencia = scanner.nextLine();
     
            System.out.println("Digite o numero da sua conta: ");
             int numeroConta =  scanner.nextInt();

            System.out.println("Digite o valor para deposito R$ ");
            double saldo = scanner.nextDouble();

            System.out.println("\"Ol\u00E1 " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " e sua conta é " + numeroConta+" e seu saldo é de R$ " + saldo + " Já está disponivel para saque" );
        }

    }
}
