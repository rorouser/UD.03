package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SerieTest {

	@Test
	void testGetTitulo() {
		
		Serie s= new Serie();
		
		s.setTitulo("Da vinci");
		assertEquals("Da vinci", s.getTitulo());
		
	}

	@Test
	void testSetTitulo() {
		
		Serie s= new Serie();
		
		s.setTitulo("Da vinci");
		assertEquals("Da vinci", s.getTitulo());
		
	}

	@Test
	void testGetnumeroTemporadas() {
		
		Serie s= new Serie();
		
		s.setnumeroTemporadas(11);
		assertEquals(11, s.getnumeroTemporadas());
		
	}

	@Test
	void testSetnumeroTemporadas() {
		
		Serie s= new Serie();
		
		s.setnumeroTemporadas(11);
		assertEquals(11, s.getnumeroTemporadas());
	}

	@Test
	void testGetGenero() {
		
		Serie s= new Serie();
		
		s.setGenero("Historisa");
		assertEquals("Historia",s.getGenero());
		
		
	}

	@Test
	void testSetGenero() {
		
		Serie s= new Serie();
		
		s.setGenero("Historia");
		assertEquals("Historia",s.getGenero());
		
		
	}

	@Test
	void testGetcreador() {
		
		Serie s= new Serie();
		
		s.setcreador("Universal");
		assertEquals("Universal",s.getcreador());
		
		
	}

	@Test
	void testSetcreador() {
		
		Serie s= new Serie();
		
		s.setcreador("Universal");
		assertEquals("Universal",s.getcreador());
		
	}

	@Test
	void testEntregar() {
		
		Serie s= new Serie();
			
		s.entregar();
		assertTrue(s.isEntregado(),"Error");
		
	}

	@Test
	void testDevolver() {
		
		Serie s= new Serie();
		
		s.entregar();
		assertFalse(s.isEntregado(),"Error");
		
	}

	@Test
	void testIsEntregado() {
		
		Serie s= new Serie();
		
		s.entregar();
		assertTrue(s.isEntregado(),"Error");
		
	}

	@Test
	void testCompareTo() {
		
		
		
		
	}

	@Test
	void testToString() {
		
		
		
	}

	@Test
	void testEqualsSerie() {
		
		
		
	}

	@Test
	void testSerie() {
		
		
	}

	@Test
	void testSerieStringString() {
		
	}

	@Test
	void testSerieStringIntStringString() {
		
	}

}
