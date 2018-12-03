package blackFriday;

import java.util.Calendar;

public class DescuentoBlackFriday {
	//Pasamos como parametro si estamos en el 23 de noviembre, en vez de mirar por calendar
	
	public double PrecioFinal(double PrecioOriginal) {
		Calendar fecha= Calendar.getInstance();
		int mes = fecha.get(Calendar.MONTH) + 1;
		int dia = fecha.get(Calendar.DAY_OF_MONTH);
		if (dia==23 && mes==11 && PrecioOriginal>0)
		{
			return (0.7*PrecioOriginal);
		}else if (PrecioOriginal<=0) {
			throw new IllegalArgumentException("Precio invalido");
		}else {
			return PrecioOriginal;
		}
	}

}
