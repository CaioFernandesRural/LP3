
public class TesteProduto {

	public static void main(String[] args) {

		Produto a = new Produto("papel");
		
		System.out.printf("\n%s, vendo", a.getNome());
		
		a.setNome("banana");
		
		System.out.printf("\n%s, vendo", a.getNome());
				
	}

}
