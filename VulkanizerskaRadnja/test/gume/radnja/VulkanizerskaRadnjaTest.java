package gume.radnja;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import gume.AutoGuma;
import gume.radnja.VulkanizerskaRadnja;

public class VulkanizerskaRadnjaTest {

	VulkanizerskaRadnja v;
	AutoGuma a,b,c;
	
	@Before
	public void setUp() throws Exception {
	    v = new VulkanizerskaRadnja();
	    a = new AutoGuma();
	    b = new AutoGuma();
	    c = new AutoGuma();
	}

	@After
	public void tearDown() throws Exception {
		 v = null;
	}

	@Test (expected = java.lang.NullPointerException.class)
	public void testDodajGumu1() {
		v.dodajGumu(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testDodajGumu2() {
		v.dodajGumu(a);
		v.dodajGumu(a);
	}
	
	@Test
	public void testDodajGumu3() {
		v.dodajGumu(a);
		assertEquals(v.gume.get(v.gume.size()-1),a);
	}

	@Test
	public void testPronadjiGumu1() {
		assertEquals(v.pronadjiGumu(null),null);
		}
	
	@Test
	public void testPronadjiGumu2() {
		v.gume.add(a);
		v.gume.add(b);
		a.setMarkaModel("Test1");
		b.setMarkaModel("Test2");
		assertEquals(v.pronadjiGumu("Test3"),null);
	}
	
	@Test
	public void testPronadjiGumu3() {
		v.gume.add(a);
		v.gume.add(b);
		a.setMarkaModel("Test1");
		b.setMarkaModel("Test2");
		assertEquals(v.pronadjiGumu("Test2").get(0),b);
	}
	
	@Test
	public void testPronadjiGumu4() {
		v.gume.add(a);
		v.gume.add(b);
		a.setMarkaModel("Test1");
		b.setMarkaModel("Test1");
		assertEquals(v.pronadjiGumu("Test1").get(0),a);
		assertEquals(v.pronadjiGumu("Test1").get(1),b);
	}

}