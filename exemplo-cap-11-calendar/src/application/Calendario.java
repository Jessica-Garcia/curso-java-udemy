package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Calendario {

	public static void main(String[] args) {
		
		// instanciação da data:
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		// criar um calendario com a data instanciada dentro dele:
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		// somar uma unidade de tempo em uma data, por exemplo 4horas:
		
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		
		System.out.println(sdf.format(d));
		
		// obtendo uma unidade de tempo, por exemplo quantos minutos tem na data:
		
		int minutes = cal.get(Calendar.MINUTE);
		
		System.out.println("Minutes: " + minutes);
		
		// obtendo uma unidade de tempo, por exemplo o mês:
		
		int month = 1 + cal.get(Calendar.MONTH);
		
		System.out.println("month " + month);

	}

}
