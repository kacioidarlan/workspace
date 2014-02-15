import java.util.HashMap;
import java.util.Map;


public class mainAutoboxing {

	public static void main(String[] args) {
		
		Map <Short, Aluno> listaAluno = new HashMap<Short, Aluno>();
		
		listaAluno.put((short) 46030, new Aluno("José", 10));
		listaAluno.put((short) 46550, new Aluno("Maria", 10));
		listaAluno.put((short) 44587, new Aluno("José", 10));
		listaAluno.put((short) 32154, new Aluno("Maria", 10));
		listaAluno.put((short) 14587, new Aluno("José", 10));
		listaAluno.put((short) 25898, new Aluno("Maria", 10));
		
		System.out.println(listaAluno);

	}

}
