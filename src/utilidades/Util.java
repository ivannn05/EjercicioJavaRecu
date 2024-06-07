package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	
	public static String crecionNombreFichero() {
		
		String nombre;
		LocalDate fecha= LocalDate.now();
		DateTimeFormatter formato=  DateTimeFormatter.ofPattern("dd-MM-yyyy");
		nombre=fecha.format(formato);
		
		return nombre;
	}
}
