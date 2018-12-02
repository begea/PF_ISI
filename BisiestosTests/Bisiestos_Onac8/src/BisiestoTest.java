import static org.junit.Assert.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

//Test para el programa Bisiestos del equipo de Onac8

public class BisiestoTest {

		int a=-1; //negativo, no divisible entre 4 o divisible entre 4 y entre 100 pero no entre 400
		int b=4; //divisible entre 4 y no entre 100
		int c=400; //divisible entre 4, entre 100 y entre 400

		@Test 
		public void testNoDivisible ()
		{
			assertFalse("ERROR: año no divisible entre 4",Bisiestos.esBisiesto(a));
			
		}
		
		@Test
		public void testDivisible4 ()
		{
			assertTrue("ERROR: año divisible entre 4",Bisiestos.esBisiesto(b));
		}
		
		@Test
		public void testDivisible100 ()
		{
			assertTrue("ERROR: año divisible entre 4, entre 100 y entre 400",Bisiestos.esBisiesto(c));
		}
		
		//Falla en testNoDivisible porque eleva una excepción y no la recoge

}