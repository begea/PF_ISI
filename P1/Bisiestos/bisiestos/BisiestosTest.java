package bisiestos;
import static org.junit.Assert.*;

import org.junit.*;

public class BisiestosTest {

		
		
		int a=-1; //negativo, no divisible entre 4 o divisible entre 4 y entre 100 pero no entre 400
		int b=4; //divisible entre 4 y no entre 100
		int c=400; //divisible entre 4, entre 100 y entre 400

		@Test 
		public void testNoDivisible ()
		{
			Bisiestos esbisiesto=new Bisiestos();
			assertFalse("ERROR: año no divisible entre 4",esbisiesto.esBisiesto(a));
		}
		
		@Test
		public void testDivisible4 ()
		{
			Bisiestos esbisiesto=new Bisiestos();
			assertTrue("ERROR: año divisible entre 4",esbisiesto.esBisiesto(b));
		}
		
		@Test
		public void testDivisible100 ()
		{
			Bisiestos esbisiesto=new Bisiestos();
			assertTrue("ERROR: año divisible entre 4, entre 100 y entre 400",esbisiesto.esBisiesto(c));
		}

}
