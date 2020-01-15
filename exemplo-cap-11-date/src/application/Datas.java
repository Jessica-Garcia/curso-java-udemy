package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Datas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		// Datas no formato padrão do java: Mon Jun 25 15:42:07 BRT 2018:
		
		Date y1 = sdf1.parse("25/06/2018"); 
		Date y2 = sdf2.parse("25/06/2018 15:42:07"); 
		
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("-----------------------");
		
		// para imprimir datas no formato dd/MM/yyyy HH:mm:ss:
		
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("-----------------------");
		
		// data com instante atual:
		
		Date x1 = new Date();
		
		Date x2 = new Date(System.currentTimeMillis());
		
		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("-----------------------");
		
		//  data no formato ISO 8601 no padrão UTC (Horário de greenwich):
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
		
		System.out.println("y3: " + sdf3.format(y3));
		System.out.println("-----------------------");

	}

}
