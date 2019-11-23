package projetAGL;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	
	private Calcul subject;
	@Before
	public void setup() {
		subject =new Calcul();
	}
	
   /* TEST ADDITION */
	
	 // test correct
	@Test
	public void test1Addition() {
		assertEquals(4.0, subject.addition(2.0, 2.0), 0.1);
			
	} 
	
	//  test incorrect
	@Test
	public void test2Addition() {	
		assertEquals(5.0, subject.addition(2.0, 2.0),0.1);	
	}
	
	//test incorrect
	@Test
	public void test3Addition() {
		assertEquals("blablabla", subject.addition(2.0, 2.0));
		
	}	
	
   /* TEST MULTIPLICATION */
	
		//test correct
	@Test
	public void test1Mutiplication() {
		assertEquals(6.0, subject.mutiplication(3.0, 2.0),0.01);
	}
	//test incorrect 
	@Test
		public void test2Mutiplication() {
			assertEquals(9.0, subject.mutiplication(3, 2),0.01);
		}

	//test incorrect 
		@Test
			public void test3Mutiplication() {
				assertEquals("blablabla", subject.mutiplication(3, 2));
	}
}

