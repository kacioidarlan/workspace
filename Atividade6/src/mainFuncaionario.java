
public class mainFuncaionario {

	public static void main(String[] args) {
		Funcionario marcos = new Funcionario("Marcos Alves", 33);
		Funcionario maria  = new Funcionario("Maria Clara", 22);
		Funcionario henrique = new Funcionario("Henrique Pedro", 55);
		
		marcos.setHabilidades("Java", "Visual Basic", "Java Server Faces");
		marcos.setFilhos("Luis Henrique");
		
		maria.setHabilidades("JavaScript", "SQL Server");
		maria.setFilhos("Marcos Pontes", "Marcelo Pontes");
		
		henrique.setHabilidades("Java", "HTML5");
		henrique.setFilhos("José Pedro", "Maria Pedro", "Neli Pedro");
		
		System.out.println(marcos);
		System.out.println(maria);
		System.out.println(henrique);

	}

}
