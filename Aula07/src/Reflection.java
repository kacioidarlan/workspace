import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Reflection {

	public static void main(String[] args) {

		Class<?> c;
		try {
			c = Class.forName("java.lang.Long");
			Method m[] = c.getMethods();
			for (int i = 0; i < m.length; i++) {
				System.out.println("Método " + i + ": " + m[i].toString());

				Class<?> p[] = m[i].getParameterTypes();
				for (int j = 0; j < p.length; j++) {
					System.out.println(p[j].getName());
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
