package embotelladora;
import static org.junit.Assert.*;
import org.junit.*;



public class EmbotelladoraTest {
	


	@Test public void allOK()
	{
		Embotelladora test= new Embotelladora();
		assertTrue("Error allOk", 2==test.calculaBotellasPequenas(2,3,17));
		assertTrue("Error allOk", 0==test.calculaBotellasPequenas(1,5,20));
		assertTrue("Error allOk", 7==test.calculaBotellasPequenas(9,2,17));
	}
	
	@Test public void negativeBig()
	{
		Embotelladora test= new Embotelladora();
		assertTrue("Error negativeBig", -1==test.calculaBotellasPequenas(2,-3,17));
	}
	
	@Test public void negativeLittle()
	{
		Embotelladora test= new Embotelladora();
		assertTrue("Error negativeLittle", -1==test.calculaBotellasPequenas(-2,3,17));
	}
	
	@Test public void negativeLiters()
	{
		Embotelladora test= new Embotelladora();
		assertTrue("Error negativeLiters", -1==test.calculaBotellasPequenas(2,3,-17));
	}
	
	@Test public void notEnoughLittle()
	{
		Embotelladora test= new Embotelladora();
		assertTrue("Error notEnoughLittle", -1==test.calculaBotellasPequenas(2,0,10));
	}
	
}
