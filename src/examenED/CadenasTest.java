package examenED;

import static org.junit.Assert.*;

import org.junit.Test;

public class CadenasTest {

	@Test
	public void testQuitarAenPrimeras2Posiciones_1() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("A");
		assertEquals("c",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_2() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("B");
		assertEquals("B",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_3() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("AA");
		assertEquals("",resultadoReal);
	}

	@Test
	public void testQuitarAenPrimeras2Posiciones_4() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("AB");
		assertEquals("B",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_5() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("BC");
		assertEquals("BC",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_6() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("PATATA");
		assertEquals("PTATA",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_7() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("AATATA");
		assertEquals("TATA",resultadoReal);
	}
	
	@Test
	public void testQuitarAenPrimeras2Posiciones_8() {
		Cadenas cad=new Cadenas();
		String resultadoReal = cad.quitarAenPrimeras2Posiciones("BCDE");
		assertEquals("BCDE",resultadoReal);
	}
	
	
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos_1() {
		Cadenas cad = new Cadenas();
		assertFalse(cad.sonPrimerosYultimos2CharsLosMismos("A"));
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos_2() {
		Cadenas cad = new Cadenas();
		assertTrue(cad.sonPrimerosYultimos2CharsLosMismos("AB"));
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos_3() {
		Cadenas cad = new Cadenas();
		assertFalse(cad.sonPrimerosYultimos2CharsLosMismos("ABCDE"));
	}
	
	@Test
	public void testSonPrimerosYultimos2CharsLosMismos_4() {
		Cadenas cad = new Cadenas();
		assertTrue(cad.sonPrimerosYultimos2CharsLosMismos("ABCAB"));
	}
	
	
	
	
	
	
	
	
	

}
