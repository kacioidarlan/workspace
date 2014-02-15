import java.util.ArrayList;


public class mainGenerics {

	public static void main(String[] args) {
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		
		listaAluno.add(new Aluno("José", 10));
		listaAluno.add(new Aluno("Maria", 10));
		
		System.out.println(listaAluno);
	}

}
