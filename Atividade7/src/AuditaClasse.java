import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AuditaClasse {

	public static void AuditarClasse(String nomeClasse) {
		Class<?> c;
		String parametro = null;
		String excecoes = null;
		try {
			c = Class.forName(nomeClasse);
			Method m[] = c.getMethods();
			System.out.println("Classe: " + c.getName() + "\n");
			System.out.println("-- M�todos --\n");

			// M�TODOS
			for (int i = 0; i < m.length; i++) {
				System.out.println("M�todo: " + m[i].getName());

				// PAR�METROS
				Class<?> p[] = m[i].getParameterTypes();
				if (p.length == 0) {
					System.out.println("Par�metro: N�o encontrado");
				} else {
					parametro = "";
					for (int j = 0; j < p.length; j++) {
						parametro += p[j].getName() + " ";
					}
					System.out.println("Par�metro: " + parametro);
				}

				// RETORNO
				System.out.println("Retorno: " + m[i].getReturnType());

				// EXCE��O
				Class<?> e[] = m[i].getExceptionTypes();
				if (e.length == 0) {
					System.out.println("Exce��o: N�o encontrado");
				} else {
					excecoes = "";
					for (int k = 0; k < e.length; k++) {
						excecoes += e[k].getName() + " ";
					}
					System.out.println("Exce��o: " + excecoes);
				}
				System.out.println("\n");
			}

			// CONSTRUTORES
			System.out.println("-- Construtores --");
			Constructor<?> construtor[] = c.getConstructors();

			for (Constructor<?> construtorItem : construtor) {
				System.out.println("\nConstrutor " + construtorItem.getName());

				// PAR�METROS
				Class<?> consParametros[] = construtorItem.getParameterTypes();
				if (consParametros.length == 0) {
					System.out.println("Par�metro: N�o encontrado");
				} else {
					parametro = "";
					for (Class<?> cParam : consParametros) {
						parametro += cParam.getName() + " ";
					}
					System.out.println("Par�metro: " + parametro);
				}

				// EXCE��ES
				Class<?> consExeption[] = construtorItem.getExceptionTypes();
				if (consExeption.length == 0) {
					System.out.println("Exce��o: N�o encontrado");
				} else {
					excecoes = "";
					for (Class<?> cExeption : consExeption) {
						excecoes += cExeption.getName() + " ";
					}
					System.out.println("Exce��o: " + excecoes);
				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
