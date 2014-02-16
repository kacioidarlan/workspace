import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class MainDatas {

	public static void main(String[] args) {

		String strDataDescobrimento = "22/04/1500";
		String strAnivDescobrimento;
		Date dataDescobrimento = new Date();
		Date anivDescobrimento = new Date();
		SimpleDateFormat formataData = new SimpleDateFormat(
				"dd/MM/yyyy");

		try {			
			dataDescobrimento = formataData
					.parse(strDataDescobrimento);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		GregorianCalendar gCalendarDataDescobrimento = new GregorianCalendar();
		gCalendarDataDescobrimento.setTime(dataDescobrimento);
		gCalendarDataDescobrimento.add(GregorianCalendar.YEAR,1);
		
		anivDescobrimento = gCalendarDataDescobrimento.getTime();
		formataData = new SimpleDateFormat("E");
		
		strAnivDescobrimento =  formataData.format(anivDescobrimento);
		System.out.println("Dia da semana do 1o aniversário do descobrimento do Brasil: "  + strAnivDescobrimento);
	}

}
