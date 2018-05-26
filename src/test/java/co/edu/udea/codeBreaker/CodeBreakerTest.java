package co.edu.udea.codeBreaker;

import static org.junit.Assert.*;
import co.edu.udea.codeBreaker.CodeBreaker;

import org.junit.Test;

public class CodeBreakerTest {

	@Test
	public void aciertanTodos() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(1234);
		assertTrue(respuesta.equalsIgnoreCase("XXXX"));
	}
	
	@Test
	public void aciertanMitadEnOrden() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(1278);
		assertTrue(respuesta.equalsIgnoreCase("XX"));
	}
	
	@Test
	public void noAciertan() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(5678);
		assertTrue(respuesta.equalsIgnoreCase(""));
	}
	@Test
	public void aciertanUno() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(1567);
		assertTrue(respuesta.equalsIgnoreCase("X"));
	}
	@Test
	public void aciertanTodosDesorden() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(4321);
		assertTrue(respuesta.equalsIgnoreCase("____"));
	}
	@Test
	public void dosEnOrdenDosEnDesorden() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(1243);
		assertTrue(respuesta.equalsIgnoreCase("XX__"));
	}
	/*@Test
	public void tamanoEquivocado() {
		CodeBreaker codeBreaker=new CodeBreaker();
		String respuesta=codeBreaker.game(12435);
		assertTrue(respuesta.equalsIgnoreCase("Tamaño de numero erroneo"));
	}*/

}
