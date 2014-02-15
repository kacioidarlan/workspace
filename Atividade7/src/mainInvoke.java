import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class mainInvoke {

	public static void main(String[] args) {

		try {

			Class<?> classeVeic = Class.forName("Veiculo");			
			
			Method metodoGetModelo = classeVeic.getMethod("getModelo");
			Method metodogetCombustivel = classeVeic.getMethod("getCombustivel");
			Method metodogetFabricante = classeVeic.getMethod("getFabricante");
			
			Object objetoVeiculo = classeVeic.newInstance();

			System.out.println(metodoGetModelo.invoke(objetoVeiculo));
			System.out.println(metodogetCombustivel.invoke(objetoVeiculo));
			System.out.println(metodogetFabricante.invoke(objetoVeiculo));
			
			
			
		} catch (InstantiationException | IllegalAccessException
				| ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
