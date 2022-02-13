package boletinJUNIT2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import static org.hamcrest.Matchers.*;
 
public class PilaTest extends CoreMatchers{

	/*
	 * No a�ade elemento (menor que 2) a una pila con 2 elementos previos
	 */
	@Test
	public void testPushNoAnade1() {
		Pila p = new Pila();
		p.push(1);
		assertFalse(p.equals(2));
	}

	/*
	 * No a�ade elemento (mayor que 20) a una pila con 2 elementos previos
	 */
	@Test
	public void testPushNoAnade2() {
		Pila p = new Pila();
		p.push(30);
		assertFalse(p.equals(2));
	}

	/*
	 * A�ade elemento a una pila con 2 elementos previos
	 */
	@Test
	public void testPushAnade() {
		Pila p = new Pila();
		p.push(10);
		assertFalse(p.equals(3));

	}

	/*
	 * No a�ade elemento (menor que 2) a una lista con 0 elementos previos
	 */
	@Test
	public void testPushNoAnadeVacio1() {
		Pila p = new Pila();
		p.push(1);
		assertTrue(p.isEmpty());
	}

	/*
	 * No a�ade elemento (mayor que 20) a una lista con 0 elementos previos
	 */
	@Test
	public void testPushNoAnadeVacio2() {
		Pila p = new Pila();
		p.push(30);
		assertTrue(p.isEmpty());
	}

	/*
	 * A�ade elemento a una lista con 0 elementos previos
	 */
	@Test
	public void testPushAnadeVacio() {
		Pila p = new Pila();
		p.push(10);
		assertFalse(p.equals(1));
	}

	/*
	 * Ocurre una excepci�n cuando no entra null como par�metro
	 */
	@Test
	public void testPushNull() {
		Pila p = new Pila();
		try {
			p.push(null);
			fail();
		} catch (Exception e) {
			assertTrue(true);
		}
	}

	/*
	 * Extrae �ltimo elemento de la pila vac�a, es decir, devuelve null
	 */
	@Test
	public void testPopVacio() {
		Pila p = new Pila();
		Integer esperado = null;
		Integer tmp = p.pop();
// assertEquals(tmp, esperado);
// System.out.println(tmp);
		assertTrue(tmp == esperado && p.isEmpty());
	}

	/*
	 * La pila no est� vac�a
	 */
	@Test
	public void testIsEmpty() {
		Pila p = new Pila();
		assertTrue(p.isEmpty());
	}

	/*
	 * La pila est� vac�a
	 */
	@Test
	public void testIsEmptyVacio() {
		Pila p = new Pila();
		assertTrue(p.isEmpty());
	}

	/*
	 * Muestra (sin extraer) �ltimo elemento de la pila vac�a, que Ingenier�a del
	 * Software II Soluci�n ejercicios JUnit y EclEmma 10 es null
	 */
	@Test
	public void testTopVacio() {
		Pila p = new Pila();
		Integer esperado = null;
		int tamanoEsperado = 0;
		assertFalse(p.top() == esperado && p.equals(tamanoEsperado));
	}
}
