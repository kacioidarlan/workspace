import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import javax.swing.JOptionPane;

public class ExercicioReflection {

	public static void main(String[] args) {
		String inputDados;
		// Informação dos valores
		inputDados = JOptionPane
				.showInputDialog("Informe o nome da classe a ser auditada: ");

		Class<?> c;
		try {
			c = Class.forName(inputDados);
			Method m[] = c.getMethods();
			System.out.println("Nome da classe: " + c.getName());

			for (int i = 0; i < m.length; i++) {
				System.out.println("Método " + i + ": " + m[i].toString());
				System.out.println("Tipo de Modificador: "
						+ Modifier.toString(m[i].getModifiers()));

				Class<?> p[] = m[i].getParameterTypes();
				for (int j = 0; j < p.length; j++) {
					System.out.println(p[j].getName());
				}

				System.out.println("Tipo de retorno: " + m[i].getReturnType());

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
