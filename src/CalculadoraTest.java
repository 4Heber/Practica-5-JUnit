
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSumar() {

		System.out.println("Sumar");

		Calculadora calc = new Calculadora(16,4);

		int expResult = 20;
		int result = calc.sumar();

		assertEquals(expResult, result);

		if (expResult != result) {

			fail("Expected result was " + expResult + " but the output is " + result);
		}
	}

	@Test
	void testRestar() {
		System.out.println("Restar");

		Calculadora calc = new Calculadora(16,4);

		int expResult = 12;
		int result = calc.restar();

		assertEquals(expResult, result);

		if (expResult != result) {

			fail("Expected result was " + expResult + " but the output is " + result);
		}
	}

	@Test
	void testMultiplicar() {
		System.out.println("Multiplicar");

		Calculadora calc = new Calculadora(16,4);

		int expResult = 64;
		int result = calc.multiplicar();

		assertEquals(expResult, result);

		if (expResult != result) {

			fail("Expected result was " + expResult + " but the output is " + result);
		}
	}

	@Test
	void testDividir() {
		System.out.println("Dividir");

		Calculadora calc = new Calculadora(16,4);

		int expResult = 4;
		int result = calc.dividir();

		assertEquals(expResult, result);

		if (expResult != result) {

			fail("Expected result was " + expResult + " but the output is " + result);
		}
	}

}
