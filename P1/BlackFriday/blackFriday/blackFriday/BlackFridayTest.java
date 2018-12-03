package blackFriday;
import static org.junit.Assert.*;
import org.junit.*;


public class BlackFridayTest {
	
	@Test public void PrecioInvalido()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		try {
			assertTrue("Menor 0",10==descuento.PrecioFinal(-10));	
		} catch (IllegalArgumentException e) {
			return;
		}
		fail("Valor menor de cero");
		
	}

	@Test public void PrecioValido()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		assertTrue("BFriday",10.0==descuento.PrecioFinal(10));
		
	}
	@Test public void PrecioValido2()
	{
		DescuentoBlackFriday descuento= new DescuentoBlackFriday();
		assertTrue("BFriday",7.0!=descuento.PrecioFinal(10));
		
	}
}
