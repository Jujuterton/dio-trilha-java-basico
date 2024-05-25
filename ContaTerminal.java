import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("--- Seja bem-vindo ao seu Banco! ---");
		System.out.println();

		System.out.println("Por favor, digite o número de sua Conta: (1234)");
		numero = sc.nextInt();

		System.out.println("Por favor, digite o número de sua Agência: (123-8)");
		agencia = sc.next();

		System.out.println("Informe seu nome completo: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Informe seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.println();
		System.out.printf("Olá %s, obrigado por criar uma conta em "
				+ "nosso banco, sua agência é %s, "
				+ "conta %d e seu saldo R$%.2f já está disponível"
				+ " para saque.", nomeCliente, agencia, numero, saldo);

		sc.close();
	}

}