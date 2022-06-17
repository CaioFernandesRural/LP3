//Figura 3.9: AccountTest.Java
//Entrada e sída de número de ponro flutuante com objetos Account.
import java.util.Scanner;

public class AccountTestM
{
	public static void displayAccount(AccountM accountToDisplay) {
		System.out.printf("%S balance: $%.2f \n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}
	
	public static void main(String[] args)
	{
		AccountM account1 = new AccountM("Jane Green", 50.00);
		AccountM account2 = new AccountM("John Blue", -7.52);
		
		//exibe saldo inicial de cada objeto
		displayAccount(account1);
		displayAccount(account2);
	
		//cria um objeto Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter deposit amount for account1: "); //prompt
		double depositAmount = input.nextDouble(); //obtém a entrada do usuário
		System.out.printf("\nadding %.2f to account1 balance \n\n", depositAmount);
		account1.deposit(depositAmount); //adiciona o saldo de account1
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		
		System.out.print("Enter deposit amount for account2: "); //prompt
		depositAmount = input.nextDouble(); //obtém a entrada do usuário
		System.out.printf("\nadding %.2f to account2 balance \n\n", depositAmount);
		account2.deposit(depositAmount); //adiciona o saldo de account2
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		
		//saque
		System.out.print("Enter withdrawal amount for account2: "); //prompt
		double withdrawalAmount = input.nextDouble(); //obtém a entrada do usuário
		System.out.printf("\nsubtracting %.2f to account2 balance \n\n", withdrawalAmount);
		account2.withdraw(withdrawalAmount); //adiciona o saldo de account2
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
	}//fim de main
}//fim da classe AcountTest
