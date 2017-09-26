package co.simplon.factorielle;

import org.junit.Assert;
import org.junit.Test;

public class TestFact {

	@SuppressWarnings("deprecation")
	@Test
	public void test1() {
		// GIVEN
		Factorielle fact = new Factorielle();
		long res;

		// WHEN
		res = fact.calculer(1);
		
		// THEN
		Assert.assertEquals(1, res);
	}

}
