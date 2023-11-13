package jokenpo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JokenpoTest {

	private Jokenpo jk;
	
	@BeforeEach
	public void inicializa() {
		jk = new Jokenpo();
	}
	
	@Test
	void testJogardor1Ganha() {
		int resultado = jk.jogar(3,1);
		assertEquals(resultado, 1);
		resultado = jk.jogar(1,2);
		assertEquals(resultado, 1);
	}
	
	@Test
	void testJogardor2Ganha() {
		int resultado = jk.jogar(1,3);
		assertEquals(resultado, 2);
		resultado = jk.jogar(2,1);
		assertEquals(resultado, 2);
	}
	
	@Test
	void testEmpate() {
		int resultado = jk.jogar(1,1);
		assertEquals(resultado, 0);
	}
	@Test
	void testJokenpoJogarComValoresInvalidos() {
		int resultado = jk.jogar(4,1);
		assertEquals(resultado, -1);
		resultado = jk.jogar(1,4);
		assertEquals(resultado, -1);
		resultado = jk.jogar(4,4);
		assertEquals(resultado, -1);
		resultado = jk.jogar(0,0);
		assertEquals(resultado, -1);
		resultado = jk.jogar(0,1);
		assertEquals(resultado, -1);
		resultado = jk.jogar(1,0);
		assertEquals(resultado, -1);
		resultado = jk.jogar(0,4);
		assertEquals(resultado, -1);
		resultado = jk.jogar(4,0);
		assertEquals(resultado, -1);

	}

}
