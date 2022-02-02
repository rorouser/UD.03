package ejerciciosUnitarias;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	void testCalcularIMC() {
		
		Persona p = new Persona();
		
		p.setAltura(180);
		p.setPeso(80);
		assertEquals(0,p.calcularIMC(),"Error, calcularIMV = 1");
		
	}

	@Test
	void testEsMayorDeEdad() {
		
		Persona p = new Persona();
		
		p.setEdad(20);
		assertTrue(p.esMayorDeEdad(),"Error");
	}

	@Test
	void testToString() {
		
		Persona p = new Persona();
		
		p.setNombre("Jose");
		p.setEdad(20);
		p.setAltura(180);
		p.setPeso(80);
		p.setSexo('H');
		
		assertNotNull((p),"Error");
		
			
	}

}
