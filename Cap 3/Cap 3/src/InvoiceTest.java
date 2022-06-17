import java.util.Scanner;

public class InvoiceTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Invoice inv1 = new Invoice("58942", "roberto", 3, 567.32);
		
		System.out.printf("\n%s | %s | %o | %.2f = %.2f\n",
				inv1.getNumero(), inv1.getDescricao(), inv1.getQuantia(), inv1.getPreco(), inv1.getInvoiceAmount());
		
		System.out.println("Numero novo: ");
		String numero = input.next();
		inv1.setNumero(numero);
		
		System.out.println("Descricao nova: ");
		String descricao = input.next();
		inv1.setDescricao(descricao);
		
		System.out.println("Quantia nova: ");
		int quantia = input.nextInt();
		inv1.setQuantia(quantia);
		
		System.out.println("Preco novo: ");
		double preco = input.nextDouble();
		inv1.setPreco(preco);
		
		System.out.printf("\n%s | %s | %o | %.2f = %.2f\n",
				inv1.getNumero(), inv1.getDescricao(), inv1.getQuantia(), inv1.getPreco(), inv1.getInvoiceAmount());
	}

}
