import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class problema1Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		HashMap<Integer, ArrayList<String>> alunos = new HashMap<>();
		
		Integer matricula = 0;
		String turma;
		
		while(true) {
			System.out.println("Nova matrícula ou existente: ");
			matricula = scan.nextInt();
			
			if(matricula < 0) {break;}
			else {
				System.out.println("Nova turma: ");
				turma = scan.next();
				
				if(alunos.containsKey(matricula)) {
					alunos.get(matricula).add(turma);
				}
				else {
					alunos.put(matricula, new ArrayList<>());
					alunos.get(matricula).add(turma);
				}
			}
		}
		for(Integer i : alunos.keySet()) {
			
			for(String j : alunos.get(i)) {
				System.out.println(i + " " + j);
			/*for(int j = 0; j < alunos.get(i).size(); j++) {
				System.out.println(i + " " + alunos.get(i).get(j));
			}*/
			}
		}
	}
}
