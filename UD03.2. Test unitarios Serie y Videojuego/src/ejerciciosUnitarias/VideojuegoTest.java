package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VideojuegoTest {

	@Test
	void testGetTitulo() {
		
		Videojuego v= new Videojuego();
		
		v.setTitulo("Spiderman");
		assertEquals("Spiderman", v.getTitulo());
		
		
		
	}

	@Test
	void testSetTitulo() {
		
		Videojuego v= new Videojuego();
		
		v.setTitulo("Spiderman");
		assertEquals("Spiderman", v.getTitulo());
	}

	@Test
	void testGetHorasEstimadas() {
		
		Videojuego v= new Videojuego();
		
		v.setHorasEstimadas(2);
		assertEquals(2, v.getHorasEstimadas());
	}

	@Test
	void testSetHorasEstimadas() {
		
		Videojuego v= new Videojuego();
		
		v.setHorasEstimadas(2);
		assertEquals(2, v.getHorasEstimadas());
	}

	@Test
	void testGetGenero() {
		
		Videojuego v= new Videojuego();
		
		v.setGenero("Amazing");
		assertEquals("Amazing", v.getGenero());
	}

	@Test
	void testSetGenero() {
		
		Videojuego v= new Videojuego();
		
		v.setGenero("Amazing");
		assertEquals("Amazing", v.getGenero());
	}

	@Test
	void testGetcompaĆnia() {
		
		Videojuego v= new Videojuego();
		
		v.setcompaĆnia("Universal");
		assertEquals("Universal", v.getcompaĆnia());
	}

	@Test
	void testSetcompaĆnia() {
		
		Videojuego v= new Videojuego();
		
		v.setcompaĆnia("Universal");
		assertEquals("Universal", v.getcompaĆnia());
	
	}

	@Test
	void testEntregar() {
		
		Videojuego v= new Videojuego();
		
		v.entregar();
		assertTrue(v.isEntregado(),"Error");
		
	}

	@Test
	void testDevolver() {
		
		Videojuego v= new Videojuego();
		
		v.devolver();
		assertFalse(v.isEntregado(),"Error");
		
	}

	@Test
	void testIsEntregado() {
		
		Videojuego v= new Videojuego();
		
		v.entregar();
		assertTrue(v.isEntregado(),"Error");
	}

	@Test
	void testCompareTo() {
		
		
		
	}

	@Test
	void testToString() {
		
		
		
	}

	@Test
	void testEqualsVideojuego() {
		
		
	}

	@Test
	void testVideojuego() {
		
	}

	@Test
	void testVideojuegoStringString() {
		
	}

	@Test
	void testVideojuegoStringIntStringString() {
		
	}

}
