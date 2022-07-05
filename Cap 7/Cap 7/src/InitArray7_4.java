// Figura 7.2: InitArray.java
// Inicializando os elementos de um array como valores padrão de zero.

public class InitArray7_4 {
	
	public static void main(String[] args) {
		
		final int ARRAY_LENGTH = 10; //declara constante
		int[] array = new int[ARRAY_LENGTH]; //cria o array
		
		//calcula valor de cada elemento do array
		for(int counter = 0; counter< array.length; counter++)
			array[counter] = 2 + 2 * counter;
		
		System.out.printf("%s%8s%n", "Index", "Value"); //títulos de coluna
		
		//gera saída do valor de cada elemento do array
		for (int counter = 0; counter < array.length; counter++)
			System.out.printf("%5d%8d%n", counter, array[counter]);
	}
} //fim da class InitArray