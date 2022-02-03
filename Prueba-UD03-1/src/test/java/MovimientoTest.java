import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.CoreMatchers;

class MovimientoTest extends CoreMatchers{

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	public void testgetConcepto() {
		
		Movimiento m = new Movimiento();
	       
		m.setConcepto("Compra");
		assertEquals("Compra", m.getConcepto());
		
	}
	
	public void testsetConcepto() {
		
		Movimiento m = new Movimiento();
	       
		m.setConcepto("Compra");
		assertEquals("Compra", m.getConcepto());
		
	}
	
	public void testsetImporte() {
		
		Movimiento m = new Movimiento();
	       
		m.setImporte(200);
		assertEquals(200, m.getImporte());
		
	}
	
	

}
