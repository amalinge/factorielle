package co.simplon.factorielle;

import static org.junit.Assert.*;

import org.junit.*;

public class TestFact {

	Factorielle f;
	long res;
	
	@Before
	public void initFact() {
		f = new Factorielle();
	}

	@Test
	public void test1() {
		// GIVEN
//		Factorielle f = new Factorielle();

		// WHEN
		res = f.calculer(1);
		
		// THEN
		assertEquals("Résultat incorrect pour la valeur 1", 1, res);
	}

	@Ignore
	@Test
	public void test0() {
		// GIVEN
//		Factorielle f = new Factorielle();

		// WHEN
		res = f.calculer(0);
		
		// THENs
		assertEquals(1, res);
	}

	@Test
	public void test10() {
		// GIVEN
//		Factorielle f = new Factorielle();

		// WHEN
		res = f.calculer(10);
		
		// THEN
		assertTrue(/*"Résultat incorrect pour la valeur 10", */ res == 3628800);
	}

	@Test
	public void test19() {
		// GIVEN
//		Factorielle f = new Factorielle();

		// WHEN
		res = f.calculer(19);
		
		// THEN
		assertTrue(/*"Résultat incorrect pour la valeur 10", */ res == 121645100408832000l);
	}

	@Test (expected=IllegalArgumentException.class)
	public void testmoins1() {
		// GIVEN
//		Factorielle f = new Factorielle();

		// WHEN
		res = f.calculer(-1);
		
		// THEN
//		assertEquals("Résultat incorrect pour la valeur 1", 1, res);
	}

	@Test (timeout=10)
	public void testtimeout() {
		// GIVEN
//		for (int i = 0 ; i < 100000 ; i++) {
		for (int i = 0 ; i < 10 ; i++) {

		// WHEN
			res = f.calculer(18);
		}
		
		// THEN
//		assertEquals("Résultat incorrect pour la valeur 1", 1, res);
	}

}
