package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutoGumaTest {

	AutoGuma a;
	
	@Before
	public void setUp() throws Exception {
		a = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		a = null;
	}

	@Test
	public void testSetMarkaModel() {
		a.setMarkaModel("Good");
		assertEquals(a.getMarkaModel(),"Good");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelString() {
		a.setMarkaModel("Wo");
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		a.setMarkaModel(null);
	}

	@Test
	public void testSetPrecnik() {
		a.setPrecnik(20);
		assertEquals(a.getPrecnik(),20);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeci() {
		a.setPrecnik(70);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManji() {
		a.setPrecnik(10);
	}

	@Test 
	public void testSetSirina() {
		a.setSirina(200);
		assertEquals(a.getSirina(),200);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaManja() {
		a.setSirina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetSirinaVeca() {
		a.setSirina(1000);
	}

	@Test
	public void testSetVisina() {
		a.setVisina(50);
		assertEquals(a.getVisina(),50);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaManja() {
		a.setVisina(10);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetVisinaVeca() {
		a.setVisina(100);
	}

	@Test
	public void testToString() {
		a.setMarkaModel("Good");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		assertEquals("AutoGuma [markaModel=Good, precnik=20, sirina=200, visina=50]" , a.toString());
	}

	@Test
	public void testEqualsObject() {
		a.setMarkaModel("Good");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Good");
		a2.setVisina(50);
		a2.setSirina(200);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),true);
		
	}
	
	@Test
	public void testEqualsObjectFalse() {
		a.setMarkaModel("Good");
		a.setVisina(50);
		a.setSirina(200);
		a.setPrecnik(20);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Good");
		a2.setVisina(60);
		a2.setSirina(200);
		a2.setPrecnik(20);
		
		assertEquals(a.equals(a2),false);
		
	}

}
