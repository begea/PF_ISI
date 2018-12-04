public class RomanNumeral{

	private boolean actualIsRep = false;
	private int restaPosible_1 = 0;
	private int restaPosible_2 = 0;
	private int Resultado;

	public int convierte(String romano){
		
		int intDigit = 0;
		int prev = 0;
		int contEquals = 0;
		int resultado = 0;
		int temp = 0;
		int max = 10000;
		int min = 10000;				
		boolean prevIsRep = false;
		boolean restado = false;
		
		
		for(Character digito: romano.toUpperCase().toCharArray()){
			actualIsRep = false;			
			intDigit = changeLetterByNumber(digito);
			
			// Si es el primer digito
			
			if (prev == 0){				
				prev = intDigit;
				temp = intDigit;
				contEquals++;
				prevIsRep = actualIsRep;
				restado = false;
			
			// Si el digito introducido es igual al anterior
				
			}else if (prev == intDigit && contEquals <= 3){
				
				// Validaciones
				
				if (actualIsRep == false || restado == true){
					Resultado = -1;
					return Resultado;
				}
				prev = intDigit;
				temp = temp + intDigit;
				prevIsRep = actualIsRep;
				contEquals++;
				restado = false;
				
			// Si el numero introducido es mayor que el anterior
				
			}else if (prev < intDigit){
				
				// Validaciones
				
				if (prevIsRep == false || contEquals > 1 || intDigit >= max ||
						(restaPosible_1 != intDigit && restaPosible_2 != intDigit) ){
					Resultado = -1;
					return Resultado;
				}
				
				min=prev;
				restado = true;
				prev = intDigit;
				temp = intDigit - temp;
				contEquals = 0;
				prevIsRep = actualIsRep;
				
			// Si el numero introducido es menor que el anterior	
			
			}else if (prev > intDigit){
				
				// Validaciones
				
				if (intDigit > min){
					Resultado = -1;
					return Resultado;
				}
				
				max = prev;
				prev = intDigit;				
				prevIsRep = actualIsRep;
				contEquals = 0;				
				resultado = resultado + temp;				
				temp = intDigit;
				restado = false;	
			}
		}
		
		resultado = resultado + temp;
		return resultado;
	}
	
	public int changeLetterByNumber(Character digito){
		
		int intDigit = 0;
		
		switch(digito){	
		case 'I':
			intDigit = 1;
			actualIsRep = true;
			restaPosible_1 = 5;
			restaPosible_2 = 10;
			break;
		case 'V':
			intDigit = 5;
			break;
		case 'X': 
			intDigit = 10;
			actualIsRep=true;
			restaPosible_1 = 50;
			restaPosible_2 = 100;
			break;
		case 'L':
			intDigit = 50;
			break;
		case 'C':
			intDigit = 100;
			actualIsRep = true;
			restaPosible_1 = 500;
			restaPosible_2 = 1000;				
			break;
		case 'D':
			intDigit = 500;
			break;
		case 'M':
			intDigit = 1000;
			actualIsRep = true;
			break;
		default:
			 Resultado= -1;				
		}
		
		return intDigit;
	
	}

}
