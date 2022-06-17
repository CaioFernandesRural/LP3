//Figura 3.13 NameDialog.java
//Obtendo a entrada de usuário a partir de um diálogo.
import javax.swing.JOptionPane;

public class NameDialog
{	
	public static void main(String[] args)
	{
		//pede para o usuário inserir deu nome
		String name = JOptionPane.showInputDialog("What is your name?");
		
		//cria a mensagem
		String message =
				String.format("Welcome, %s, to Java programming!", name);
		
		//Exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);
	}//fim de main
}//termina NameDialog