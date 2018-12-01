package Bisiesto;

public class bisiesto {
	public static boolean esBisiesto(int año) {
	     if(año % 4 == 0 && año % 100 != 0 || año % 400 == 0){
	         return true;
	     }else{
	         return false;
	     }
	}
}
