
public class TesteMedia {

	public static void main(String[] args) {
		
		Media maria = new Media( 6.23, 4.12);
		Media marcos = new Media( 6.27, 5.40);
		
		System.out.printf("\nMedia Maria: %.2f", maria.calcularMedia());
		System.out.printf("\nMedia Maria: %.2f", marcos.calcularMedia());

	}

}
