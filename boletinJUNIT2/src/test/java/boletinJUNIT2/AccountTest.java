package boletinJUNIT2;

import static org.junit.jupiter.api.Assertions.*;
import java.util.stream.Stream;
import static org.hamcrest.MatcherAssert.*;
import org.hamcrest.CoreMatchers;
import org.hamcrest.core.AnyOf;
import org.hamcrest.object.HasToString;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
@DisplayName("Test Account")
class AccountTest extends CoreMatchers{
	
	private Account cuenta;
	
	private String duenio;
	private long numCuenta;
	private float dinero, deposito, retiro, tarifa;
	private boolean exitoRetiro=false;
	
	
	
	static Stream<Arguments> cuentas() {
		
		return Stream.of(
				
				Arguments.of("cert", 13,500, -1, 200, -1, false), 
				Arguments.of("tosten", 11, 700, 900, 800, 20, false), 
				Arguments.of("xiugli", 10, 1200,100, 500, 40, true)
		);
	}

	@MethodSource("account")
	@ParameterizedTest
	@DisplayName("Constructor")
	void testAccount(String duenio, long numCuenta, float dinero) {
		
		cuenta= new Account(duenio, numCuenta, dinero);
		long numeroCuenta=0;
		
		if(numCuenta==13) {
			numeroCuenta=numCuenta;
		
		}if(numCuenta==11) {
			numeroCuenta=numCuenta;
		
		}if(numCuenta==10) {
			numeroCuenta=numCuenta;
		}
		
		
		
		assertThat("Error",cuenta.getAccountNumber(), is(numeroCuenta));
	}

	@ParameterizedTest
	@MethodSource("account")
	@DisplayName("Test depositar dinero")
	void testDeposit(String duenio, long numCuenta, float dinero, float deposito) {
		
		cuenta= new Account(duenio, numCuenta, dinero);
		boolean depositado;
		if(deposito>0) {
			depositado=true;
		}else {
			depositado=false;
		}
		
		assertThat("Error el metodo deposit no funciona", cuenta.deposit(deposito), is (depositado));
	}

	@ParameterizedTest
	@MethodSource("account")
	@DisplayName("Test sacar dinero")
	void testWithdraw(String duenio, long numCuenta, float dinero, float deposito, float retiro, float tarifa, boolean exitoRetiro) {
		
		cuenta= new Account(duenio, numCuenta, dinero);

		assertThat("Error", cuenta.withdraw(retiro, tarifa), is (exitoRetiro));
	}
	

	@ParameterizedTest
	@MethodSource("account")
	@DisplayName("Test interes")
	void testAddInterest(String duenio, long numCuenta, float dinero) {
		
		cuenta= new Account(duenio, numCuenta, dinero);
		float intereses=0.045f;
		float interes=dinero+(dinero*intereses);
		cuenta.addInterest();
		assertThat("Error el metodo addInterest no funciona", cuenta.getBalance(), is(interes));
	}

	@ParameterizedTest
	@MethodSource("account")
	@DisplayName("Test balance")
	void testGetBalance(String duenio, long numCuenta, float dinero) {
		
		cuenta= new Account(duenio, numCuenta, dinero);
		float cartera= dinero;
		float okBalance=-1;
		
		if(cartera==500) {
			okBalance=cartera;	
		}if(cartera==700) {
			okBalance=cartera;
		}if(cartera==1200) {
			okBalance=cartera;	
		}
		
		
		assertThat("Error el metodo getBalance no funciona", cuenta.getBalance(), is(okBalance));
	}

	@ParameterizedTest
	@MethodSource("account")
	@DisplayName("Test numero de la cuenta")
	void testGetAccountNumber(String duenio, long numCuenta, float dinero) {
		
		cuenta= new Account(duenio, numCuenta, dinero);
		long numeroCuenta=0;
		
		if(numCuenta==13) {
			numeroCuenta=numCuenta;
		
		}
		if(numCuenta==11) {
			numeroCuenta=numCuenta;
		
		}
		if(numCuenta==10) {
			numeroCuenta=numCuenta;
		}
		assertThat("Error",cuenta.getAccountNumber(), is(numeroCuenta));
	}

	@ParameterizedTest
	@MethodSource("accouns")
	@DisplayName("Test toString")
	void testToString(String duenio, long numCuenta, float dinero) {
		cuenta= new Account(duenio, numCuenta, dinero);
		
		long id=numCuenta;
		assertThat("Error",cuenta.toString(), is(containsString(duenio)));
	}


	
	
}
