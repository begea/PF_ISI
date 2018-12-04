import static org.junit.Assert.*;
import org.junit.Test;

public class RomanNumeralTest {

	public void setUp() throws Exception {
	}

	// Prueba para el numero romano III
	
	@Test	
	public void convertirItest() {
		String romano = "III";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(3, result);		
	}
	

	// Prueba para el numero romano IV
	
	@Test
	public void convertirVtest() {
		String romano = "IV";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(4, result);		
	}
	
	// Prueba para el numero romano XXX
	
	@Test
	public void convertirXtest() {
		String romano = "XXX";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(30, result);		
	}
	
	 // Prueba para el numero romano LX
	
	@Test
	public void convertirXXtest() {
		String romano = "LX";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(60, result);		
	}
	
	// Prueba para el numero romano DD
	
	@Test
	public void convertirDDtest() {
		String romano = "DD";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	

	// Prueba para el numero romano XXC
	
	@Test
	public void convertirXXCtest() {
		String romano = "XXC";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano XXIII
	
	@Test
	public void convertirXXIIItest() {
		String romano = "XXIII";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(23, result);		
	}

	// Prueba para el numero romano XXLVII
	
	@Test
	public void convertirXXLVIICtest() {
		String romano = "XXLVII";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano VL
	
	@Test
	public void convertirVLCtest() {
		String romano = "VL";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano CMM
	
	@Test
	public void convertirCMMtest() {
		String romano = "CMM";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano IXVI
	
	@Test
	public void convertirIXVItest() {
		String romano = "IXVI";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
 	// Prueba para el numero romano IC
	
	@Test
	public void convertirICtest() {
		String romano = "IC";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano IXL
	
	@Test
	public void convertirIXLtest() {
		String romano = "IXL";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano XIL
	
	@Test
	public void convertirXILtest() {
		String romano = "XIL";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano VIV
	
	@Test
	public void convertirVIVtest() {
		String romano = "VIV";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(-1, result);		
	}
	
	// Prueba para el numero romano CDXL
	
	@Test
	public void convertirCDXLtest() {
		String romano = "CDXL";
		RomanNumeral convierte = new RomanNumeral();
		int result = convierte.convierte(romano);
		assertEquals(440, result);		
	}

}