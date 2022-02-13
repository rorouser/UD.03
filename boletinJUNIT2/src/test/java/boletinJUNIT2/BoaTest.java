package boletinJUNIT2;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.hamcrest.*;
import static org.hamcrest.Matchers.*;
@DisplayName("Test Boa")
class BoaTest extends CoreMatchers{

	private Boa boa;
	private boolean sano;
	private int cueva;

	static Stream<Arguments> datos() {
		return Stream.of(
				
				Arguments.of("Cobra", 12, "Conejo",false,11), 
				Arguments.of("Mamba", 2, "Insectos", false, 3),
				Arguments.of("Culebra", 10, "Humanos",false, 9), 
				Arguments.of("Pit�n", 3, "granola bars", true, 3)
		);
	}

	
	@ParameterizedTest
	@MethodSource("datos")
	@DisplayName("Test al constructor")
	void testBoa(String nombre, int tamanio, String comida) {
		
		boa= new Boa(nombre, tamanio, comida);
		
		assertThat("Error no funciona el constructor", boa, notNullValue());
	}

	@ParameterizedTest
	@MethodSource("datos")
	@DisplayName("Test sano")
	void testIsHealthy(String nombre, int tamanio, String comida, boolean sano) {
		
		boa= new Boa(nombre, tamanio, comida);
		
		
		assertThat("Error",boa.isHealthy(), equalTo(sano));
	}

	@ParameterizedTest
	@MethodSource("datos")
	@DisplayName("Test si cabe en la cueva")
	void testFitsInCage(String nombre, int tamanio, String comida, boolean sano, int cueva) {
		
		boa= new Boa(nombre, tamanio, comida);
		boolean PuedeEntrar;
		
		if(tamanio<cueva) {
			PuedeEntrar=true;
		}else {
			PuedeEntrar=false;
		}
		
		assertThat("Error", boa.fitsInCage(cueva), equalTo(PuedeEntrar));
	}

}