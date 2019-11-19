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
	
	 // methode pour un test correct
	@Test
	public void test1Addition() {
		assertEquals(4, subject.addition(2, 2));
	}
	
	// methode pour un test incorrect
	@Test
	public void test2Addition() {	
		assertEquals("blablabla", subject.addition(2, 2));	
	}
	
	// methode pour un test incorrect
	@Test
	public void test3Addition() {
		assertEquals(5, subject.addition(2, 2));	
	}	
	
   /* TEST MULTIPLICATION */
	
		//test correct
	@Test
	public void test1Mutiplication() {
		assertEquals(6, subject.mutiplication(3, 2));
	}
	//test incorrect 
	@Test
		public void test2Mutiplication() {
			assertEquals(9, subject.mutiplication(3, 2));
		}

	//test incorrect 
		@Test
			public void test3Mutiplication() {
				assertEquals("blablabla", subject.mutiplication(3, 2));
	}
}

